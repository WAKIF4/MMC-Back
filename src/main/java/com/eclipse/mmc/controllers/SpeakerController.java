package com.eclipse.mmc.controllers;

import com.eclipse.mmc.entities.Speaker;
import com.eclipse.mmc.services.impl.SpeakerService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SpeakerController {

    private final SpeakerService speakerService;

    public SpeakerController(SpeakerService speakerService) {
        this.speakerService = speakerService;
    }


    // http://localhost:8080/api/speakers
    @GetMapping("/speakers")
    public ResponseEntity<List<Speaker>> getAllSpeakers() {
        List<Speaker> speakers = speakerService.getAllSpeakers();
        return new ResponseEntity<>(speakers, HttpStatus.OK);
    }

    // http://localhost:8080/api/speakers/1
    @GetMapping("/speakers/{id}")
    public ResponseEntity<Speaker> getSpeakerById(@PathVariable("id") Long id) {
        Speaker speaker = speakerService.getSpeakerById(id);
        return new ResponseEntity<>(speaker, HttpStatus.OK);
    }

    //http://localhost:8080/api/speakers
    @PostMapping("/speakers")
    public ResponseEntity<Speaker> createSpeaker(@RequestBody Speaker speaker) {
        Speaker saveSpeaker = speakerService.createSpeaker(speaker);
        return new ResponseEntity<>(saveSpeaker, HttpStatus.CREATED);
    }

    //http://localhost:8080/api/speakers/1
    @PutMapping("/speakers/{id}")
    public ResponseEntity<Speaker> updateSpeaker(@PathVariable Long id, @RequestBody Speaker updatedSpeaker) {
        Speaker speaker = speakerService.updateSpeaker(id, updatedSpeaker);
        return new ResponseEntity<>(speaker, HttpStatus.OK);
    }

    // http://localhost:8080/api/speakers/1
    @DeleteMapping("/speakers/{id}")
    public ResponseEntity<String> deleteSpeaker(@PathVariable("id") Long id) {
        speakerService.deleteSpeaker(id);
        return new ResponseEntity<>("Speaker successfully deleted!", HttpStatus.OK);
    }
}
