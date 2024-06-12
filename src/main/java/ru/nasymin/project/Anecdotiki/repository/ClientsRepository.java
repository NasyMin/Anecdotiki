package ru.nasymin.project.Anecdotiki.repository;

import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import ru.nasymin.project.Anecdotiki.model.Clients;


public interface ClientsRepository extends CrudRepository<Clients, Long> {
    Optional<Clients> findByUsername(String username);
}