package com.eclipse.mmc.services.impl;

import com.eclipse.mmc.entities.Session;
import com.eclipse.mmc.repositories.ISessionRepository;
import com.eclipse.mmc.services.ISessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionService implements ISessionService {
    @Autowired
    private ISessionRepository sessionRepository;

    public Session addSession(Session session) {
        Session s = sessionRepository.save(session);
        return s;
    }

    @Override
    public List<Session> getAll() {
        List<Session> sessionList = sessionRepository.findAll();
        return sessionList;
    }

    public Optional<Session> getById(Long id) {
        Optional<Session> session = sessionRepository.findById(id);
        return session;
    }

    public void deleteById(Long id) {
        sessionRepository.deleteById(id);
    }

    public int update(Long id, Session session) {
        Optional<Session> old = sessionRepository.findById(id);

        if (old.isPresent()) {
            Session s = old.get();
            s.setTitre(session.getTitre());
            s.setDescription(session.getDescription());
            s.setHeureDebut(session.getHeureDebut());
            s.setHeureFin(session.getHeureFin());
            s.setCategorie(session.getCategorie());


            sessionRepository.save(s);

            return 1;
        }
        return -1;
    }


}
