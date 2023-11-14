package com.eclipse.mmc.controllers;

import com.eclipse.mmc.entities.Partenaire;
import com.eclipse.mmc.entities.Participant;
import com.eclipse.mmc.services.IParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/participant")
public class ParticipantController {
    @Autowired
    private IParticipantService participantService;
    @GetMapping("/all")
    public List<Participant> getAll(){
        return participantService.getAllParticipant();
    }
    @GetMapping("/by-id/{id}")
    public Optional<Participant> getPartenaireById(@PathVariable long id){
        return participantService.getParticipantById(id);
    }
    @PostMapping("/save")
    public Participant saveParticipant(@RequestBody Participant participant){
        return participantService.saveParticipant(participant);
    }
    @PutMapping("/update/{id}")
    public Participant updateParticipant(@PathVariable long id,@RequestBody Participant updateParticipant){
        return participantService.updateParticipant(id,updateParticipant);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        participantService.deleteParticipant(id);
    }

}

