package com.eclipse.mmc.repositories;

import com.eclipse.mmc.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICategorieRepository extends JpaRepository<Categorie,Long> {
}
