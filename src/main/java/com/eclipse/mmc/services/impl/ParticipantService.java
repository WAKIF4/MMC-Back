package com.eclipse.mmc.services.impl;

import com.eclipse.mmc.entities.Participant;
import com.eclipse.mmc.repositories.IParticipantRepository;
import com.eclipse.mmc.services.IParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipantService implements IParticipantService {
    @Autowired
    private IParticipantRepository participantRepository;
    public List<Participant> getAllParticipant(){
        return participantRepository.findAll();
    }

    public Optional<Participant> getParticipantById(long id){
        return participantRepository.findById(id);
    }
    public Participant saveParticipant(Participant participant){
        return participantRepository.save(participant);
    }
    public Participant updateParticipant(long id, Participant updateParticipant){
        if(participantRepository.existsById(id)){
            updateParticipant.setId(id);
            return participantRepository.save(updateParticipant);
        }
        else return null;
    }
    public void deleteParticipant(long id){
        participantRepository.deleteById(id);
    }
}

