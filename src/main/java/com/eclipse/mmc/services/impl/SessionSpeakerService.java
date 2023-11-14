package com.eclipse.mmc.services.impl;

import com.eclipse.mmc.entities.Event;
import com.eclipse.mmc.entities.Session;
import com.eclipse.mmc.entities.Session_Speaker;
import com.eclipse.mmc.repositories.IEventRepository;
import com.eclipse.mmc.repositories.ISessionSpeakerRepository;
import com.eclipse.mmc.services.ISessionSpeakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SessionSpeakerService implements ISessionSpeakerService {
    @Autowired
    IEventRepository eventRepository;
    @Autowired
    ISessionSpeakerRepository sessionSpeakerRepository;
    public int nbDeSpeaker(Long id){
        int c=0;
        Optional<Event> e1=eventRepository.findById(id);
        if(e1.isPresent()){
            Event e=e1.get();
        List<Session> sessionList = e.getSession();
        sessionList.forEach(System.out::println);

        for (Session s:sessionList){


            List<Session_Speaker>sessionSpeaker=sessionSpeakerRepository.findBySession(s);
            c+=sessionSpeaker.size();

        }}
        return c;
    }

}
