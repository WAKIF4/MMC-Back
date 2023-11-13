package com.eclipse.mmc.repositories;

import com.eclipse.mmc.entities.Pays;
import com.eclipse.mmc.entities.Ville;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IVilleRepository extends JpaRepository<Ville, Long> {

    List<Ville> findAll();

    Optional<Ville> findById(Long id);

    Ville save(Ville ville);

    void deleteById(Long id);
    List<Ville> findByPays(Pays pays);
}
