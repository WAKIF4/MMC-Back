package com.eclipse.mmc.repositories;

import com.eclipse.mmc.entities.Participant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IParticipantRepository extends JpaRepository<Participant,Long> {
}
