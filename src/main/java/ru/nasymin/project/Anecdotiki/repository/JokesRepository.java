package ru.nasymin.project.Anecdotiki.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.nasymin.project.Anecdotiki.model.Jokes;

@Repository
public interface JokesRepository extends JpaRepository<Jokes, Long> {

}
