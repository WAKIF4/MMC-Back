package com.eclipse.mmc.repositories;

import com.eclipse.mmc.entities.Sponsor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ISponsorRepository extends JpaRepository<Sponsor,Long> {

}
