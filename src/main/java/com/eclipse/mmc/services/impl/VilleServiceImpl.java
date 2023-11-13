package com.eclipse.mmc.services.impl;

import com.eclipse.mmc.entities.Pays;
import com.eclipse.mmc.entities.Ville;
import com.eclipse.mmc.repositories.IVilleRepository;
import com.eclipse.mmc.services.IVilleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class VilleServiceImpl implements IVilleService {

    @Autowired
    private IVilleRepository IVilleRepository;


    @Override
    public List<Ville> getAllVilles() {
        return IVilleRepository.findAll();
    }

    @Override
    public Optional<Ville> getVilleById(Long id) {
        return IVilleRepository.findById(id);
    }
/*
    @Override
    public List<Ville> getVillesByPays(Pays pays) {
        return villeRepository.findByPays(pays);
    }*/


    @Override
    public List<Ville> getVillesByPays(Pays pays) {
        if (pays == null) {
            return Collections.emptyList();
        }
        return pays.getVilles();
    }

    @Override
    public Ville saveVille(Ville ville) {
        return IVilleRepository.save(ville);
    }

    @Override
    public void deleteVille(Long id) {
        IVilleRepository.deleteById(id);
    }
}
