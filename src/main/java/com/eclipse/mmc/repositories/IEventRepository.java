package com.eclipse.mmc.repositories;

import com.eclipse.mmc.entities.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEventRepository extends JpaRepository<Event,Long> {
}
