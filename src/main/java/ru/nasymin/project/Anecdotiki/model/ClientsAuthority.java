package ru.nasymin.project.Anecdotiki.model;

import org.springframework.security.core.GrantedAuthority;

public enum ClientsAuthority implements GrantedAuthority {
    DEFAULT_USER,
    MODERATOR,
    ADMIN;

    @Override
    public String getAuthority() {
        return this.name();
    }
}