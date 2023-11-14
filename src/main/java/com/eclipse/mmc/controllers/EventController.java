package com.eclipse.mmc.controllers;

import com.eclipse.mmc.repositories.ISessionSpeakerRepository;
import com.eclipse.mmc.services.ISessionSpeakerService;
import com.eclipse.mmc.services.impl.SessionSpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")

public class EventController {
    @Autowired
    ISessionSpeakerService sessionSpeakerService;
    @GetMapping("/{id}")
    public int nbDeSpeaker(@PathVariable Long id) {
        return sessionSpeakerService.nbDeSpeaker(id);
    }
}
