package ru.nasymin.project.Anecdotiki.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.nasymin.project.Anecdotiki.model.ClientsRole;
import ru.nasymin.project.Anecdotiki.service.ClientsService;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/clients")
public class ClientsController {
    private final ClientsService clientsService;

    @PutMapping("/{username}/role")
    public ResponseEntity<Void> setUserRole(@PathVariable String username, @RequestBody ClientsRole role) {
        clientsService.setUserRole(username, role);
        return ResponseEntity.ok().build();
    }
    
    @GetMapping("/{username}/roles")
    public ResponseEntity<List<ClientsRole>> getUserRoles(@PathVariable String username) {
        List<ClientsRole> roles = clientsService.getUserRoles(username);
        return ResponseEntity.ok(roles);
    }

}