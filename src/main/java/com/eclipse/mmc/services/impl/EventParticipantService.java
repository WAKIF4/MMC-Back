package com.eclipse.mmc.services.impl;

import com.eclipse.mmc.entities.Event;
import com.eclipse.mmc.entities.Participant;
import com.eclipse.mmc.repositories.IEventRepository;
import com.eclipse.mmc.repositories.IParticipantRepository;
import com.eclipse.mmc.services.IEventParticipantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventParticipantService implements IEventParticipantService {
    @Autowired
    private IEventRepository eventRepository;
    @Autowired
    private IParticipantRepository participantRepository;
    public int addParticipantToEvent(Long eventId){
        Event event = eventRepository.findById(eventId).orElse(null);

        if(event != null){
            return event.getParticipants().size();
        } else {
            return 0;
        }
    }



}
