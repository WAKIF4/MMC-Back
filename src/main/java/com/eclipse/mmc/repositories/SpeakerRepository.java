package com.eclipse.mmc.repositories;

import com.eclipse.mmc.entities.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
