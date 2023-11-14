package com.eclipse.mmc.controllers;

import com.eclipse.mmc.entities.Session;
import com.eclipse.mmc.services.ICategorieService;

import com.eclipse.mmc.services.ISessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("mmc/Session")
public class SessionController {
    @Autowired
    private ISessionService sessionService;
    @PostMapping("/")
    public Session addSession(@RequestBody Session session) {
        return sessionService.addSession(session);
    }
    @GetMapping("/")
    public List<Session> getAll() {
        return sessionService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Session> getById(@PathVariable Long id) {
        return sessionService.getById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        sessionService.deleteById(id);
    }
    @PutMapping("/{id}")
    public int update(@PathVariable Long id, @RequestBody Session session) {
        System.out.println(id);
        System.out.println(session.getTitre());
        return sessionService.update(id, session);
    }

}

