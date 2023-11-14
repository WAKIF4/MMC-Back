package com.eclipse.mmc.services.impl;

import com.eclipse.mmc.entities.Event;
import com.eclipse.mmc.repositories.IEventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EventService {
    @Autowired
    IEventRepository eventRepository;

    public Event addEvent(Event event) {
        return eventRepository.save(event);
    }

    public List<Event> getAll() {
        List<Event> eventList = eventRepository.findAll();
        return eventList;
    }

    public Optional<Event> getById(Long id) {
        return eventRepository.findById(id);
    }

    public void deleteById(Long id) {
        eventRepository.deleteById(id);
    }

    public Event update(Long id, Event event) {
        if (eventRepository.existsById(id)) {
            event.setId(id);
            return eventRepository.save(event);

        }
        return null;
    }
}
