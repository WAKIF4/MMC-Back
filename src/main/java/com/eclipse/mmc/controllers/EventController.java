package com.eclipse.mmc.controllers;

import com.eclipse.mmc.entities.Event;
import com.eclipse.mmc.services.IEventParticipantService;
import com.eclipse.mmc.services.impl.EventParticipantService;
import com.eclipse.mmc.services.impl.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import com.eclipse.mmc.repositories.ISessionSpeakerRepository;
import com.eclipse.mmc.services.ISessionSpeakerService;
import com.eclipse.mmc.services.impl.SessionSpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/events")

public class EventController {
    @Autowired
    ISessionSpeakerService sessionSpeakerService;

    @Autowired
    EventService eventService;
    @Autowired
    private IEventParticipantService eventParticipantService;
    @GetMapping("/nbParticipant/{id}")
    public ResponseEntity<Integer> getNombreDeParticipants(@PathVariable Long id) {
        int nombreDeParticipant = eventParticipantService.addParticipantToEvent(id);
        return new ResponseEntity<>(nombreDeParticipant, HttpStatus.OK);
    }
    @GetMapping("/nbDespeaker/{id}")
    public int nbDeSpeaker(@PathVariable Long id) {
        return sessionSpeakerService.nbDeSpeaker(id);

    }
    @PostMapping("/")
    public Event addEvent(@RequestBody Event event) {
        return eventService.addEvent(event);
    }
    @GetMapping("/")
    public List<Event> getAll() {
        return eventService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Event> getById( @PathVariable Long id) {
        return eventService.getById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        eventService.deleteById(id);
    }
    @PutMapping("/{id}")
    public Event update(@PathVariable Long id,@RequestBody  Event event) {
        return eventService.update(id, event);
    }

}
