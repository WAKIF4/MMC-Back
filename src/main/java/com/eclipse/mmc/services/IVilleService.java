package com.eclipse.mmc.services;

import com.eclipse.mmc.entities.Pays;
import com.eclipse.mmc.entities.Ville;

import java.util.List;
import java.util.Optional;

public interface IVilleService {

    List<Ville> getAllVilles();
    Optional<Ville> getVilleById(Long id);
    List<Ville> getVillesByPays(Pays pays);
    Ville saveVille(Ville ville);
    void deleteVille(Long id);
}
