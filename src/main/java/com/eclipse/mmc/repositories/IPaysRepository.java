package com.eclipse.mmc.repositories;

import com.eclipse.mmc.entities.Pays;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IPaysRepository extends JpaRepository<Pays, Long> {

    List<Pays> findAll();

    Optional<Pays> findById(Long id);

    Pays save(Pays pays);

    void deleteById(Long id);
}
