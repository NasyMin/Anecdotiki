package ru.nasymin.project.Anecdotiki.service;

import ru.nasymin.project.Anecdotiki.model.ClientsRole;

import java.util.List;

public interface ClientsService {
    void registration(String username, String password);
    List<ClientsRole> getUserRoles(String username);
    void setUserRole(String username, ClientsRole role);
}