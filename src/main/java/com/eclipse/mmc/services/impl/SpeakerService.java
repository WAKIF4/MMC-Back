package com.eclipse.mmc.services.impl;

import com.eclipse.mmc.entities.Speaker;
import com.eclipse.mmc.exception.SpeakerNotFoundException;
import com.eclipse.mmc.repositories.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpeakerService {

    private SpeakerRepository speakerRepository;

    @Autowired
    public SpeakerService(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    public Speaker createSpeaker(Speaker speaker) {
        return speakerRepository.save(speaker);
    }

    public List<Speaker> getAllSpeakers() {
        return speakerRepository.findAll();
    }

    public Speaker getSpeakerById(Long id) {
        return speakerRepository.findById(id)
                .orElseThrow(() -> new SpeakerNotFoundException("Speaker not found"));
    }

    public Speaker updateSpeaker(Long id, Speaker speaker) {
        Speaker existingSpeaker = getSpeakerById(id);
        existingSpeaker.setFirstName(speaker.getFirstName());
        existingSpeaker.setLastName(speaker.getLastName());
        existingSpeaker.setImage(speaker.getImage());
        existingSpeaker.setBio(speaker.getBio());
        existingSpeaker.setMCT(speaker.isMCT());
        existingSpeaker.setMVC(speaker.isMVC());
        existingSpeaker.setLien(speaker.getLien());

        return speakerRepository.save(existingSpeaker);
    }

    public void deleteSpeaker(Long id) {
        Speaker speaker = getSpeakerById(id);
        speakerRepository.delete(speaker);
    }

}
