package com.eclipse.mmc.repositories;

import com.eclipse.mmc.entities.Session;
import com.eclipse.mmc.entities.Session_Speaker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISessionSpeakerRepository extends JpaRepository<Session_Speaker,Long> {
    List<Session_Speaker> findBySession(Session s);

}
