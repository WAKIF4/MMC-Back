package com.eclipse.mmc.repositories;

import com.eclipse.mmc.entities.Partenaire;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPartenaireRepository extends JpaRepository<Partenaire,Long> {
}
