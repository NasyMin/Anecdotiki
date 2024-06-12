package ru.nasymin.project.Anecdotiki.repository;

import org.springframework.data.repository.CrudRepository;
import ru.nasymin.project.Anecdotiki.model.ClientsRole;


public interface ClientsRolesRepository extends CrudRepository<ClientsRole, Long> {
}