package com.eclipse.mmc.services;

import com.eclipse.mmc.entities.Categorie;
import com.eclipse.mmc.entities.Session;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ISessionService {
    Session addSession(Session session);
    List<Session> getAll();

    Optional<Session> getById(Long id);
    void deleteById(Long id);
    int update(Long id,Session session);

}
