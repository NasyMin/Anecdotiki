package ru.nasymin.project.Anecdotiki.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.nasymin.project.Anecdotiki.model.Users;
import ru.nasymin.project.Anecdotiki.service.UsersService;

import java.util.List;

@RestController
@AllArgsConstructor
public class UsersController {

    private final UsersService usersService;

    @GetMapping("/callJokes")
    public ResponseEntity<List<Users>> getJokesCalls() {
        List<Users> users = usersService.allJokesCalls();
        return ResponseEntity.ok(users);
    }
    @GetMapping("/top5")
    public ResponseEntity<List<Users>> getTopFiveJokes() {
        List<Users> topFiveJokes = usersService.topFiveJokes();
        return ResponseEntity.ok(topFiveJokes);
    }
}