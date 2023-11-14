package com.eclipse.mmc.controllers;

<<<<<<< HEAD
import com.eclipse.mmc.services.IEventParticipantService;
import com.eclipse.mmc.services.impl.EventParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
=======
import com.eclipse.mmc.repositories.ISessionSpeakerRepository;
import com.eclipse.mmc.services.ISessionSpeakerService;
import com.eclipse.mmc.services.impl.SessionSpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
>>>>>>> develop
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/events")
<<<<<<< HEAD
public class EventController {
    @Autowired
    private IEventParticipantService eventParticipantService;
    @GetMapping("/{id}")
    public ResponseEntity<Integer> getNombreDeParticipants(@PathVariable Long id){
        int nombreDeParticipant = eventParticipantService.addParticipantToEvent(id);
        return new ResponseEntity<>(nombreDeParticipant, HttpStatus.OK);
=======

public class EventController {
    @Autowired
    ISessionSpeakerService sessionSpeakerService;
    @GetMapping("/{id}")
    public int nbDeSpeaker(@PathVariable Long id) {
        return sessionSpeakerService.nbDeSpeaker(id);
>>>>>>> develop
    }
}
