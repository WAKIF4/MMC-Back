package com.eclipse.mmc.repositories;

import com.eclipse.mmc.entities.Categorie;
import com.eclipse.mmc.entities.Session;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ISessionRepository extends JpaRepository<Session,Long> {

}

