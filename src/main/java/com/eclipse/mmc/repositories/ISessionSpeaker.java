package com.eclipse.mmc.repositories;

import com.eclipse.mmc.entities.Session_Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISessionSpeaker extends JpaRepository<Session_Speaker,Long> {
}
