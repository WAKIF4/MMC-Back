package com.eclipse.mmc.services;

import com.eclipse.mmc.entities.Pays;

import java.util.List;
import java.util.Optional;

public interface IPaysService {

    List<Pays> getAllPays();

    Optional<Pays> getPaysById(Long id);

    Pays savePays(Pays pays);

    void deletePays(Long id);
}
