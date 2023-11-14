package com.eclipse.mmc.services;

import com.eclipse.mmc.entities.Participant;

import java.util.List;
import java.util.Optional;

public interface IParticipantService {
    public List<Participant> getAllParticipant();
    public Optional<Participant> getParticipantById(long id);
    public Participant saveParticipant(Participant participant);
    public Participant updateParticipant(long id, Participant updateParticipant);
    public void deleteParticipant(long id);
}
