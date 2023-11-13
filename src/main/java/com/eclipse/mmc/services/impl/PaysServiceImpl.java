package com.eclipse.mmc.services.impl;

import com.eclipse.mmc.entities.Pays;
import com.eclipse.mmc.repositories.IPaysRepository;
import com.eclipse.mmc.services.IPaysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaysServiceImpl implements IPaysService {
    @Autowired
    private IPaysRepository IPaysRepository;


    @Override
    public List<Pays> getAllPays() {
        return IPaysRepository.findAll();
    }

    @Override
    public Optional<Pays> getPaysById(Long id) {
        return IPaysRepository.findById(id);
    }

    @Override
    public Pays savePays(Pays pays) {
        return IPaysRepository.save(pays);
    }

    @Override
    public void deletePays(Long id) {
        IPaysRepository.deleteById(id);
    }


}
