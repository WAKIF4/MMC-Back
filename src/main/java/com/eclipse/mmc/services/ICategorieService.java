package com.eclipse.mmc.services;

import com.eclipse.mmc.entities.Categorie;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
@Component
public interface ICategorieService {
    Categorie addCategorie(Categorie categorie);
    List<Categorie> getAll();
    Optional<Categorie> getById(Long id);
    void deleteById(Long id);
    int update(Long id,Categorie categorie);

}
