package com.eclipse.mmc.services.impl;

import com.eclipse.mmc.entities.Partenaire;
import com.eclipse.mmc.repositories.IPartenaireRepository;
import com.eclipse.mmc.services.IPartenaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PartenaireService implements IPartenaireService {
    @Autowired
    private IPartenaireRepository partenaireRepository;

    public List<Partenaire> getAllPartenaire(){
        return partenaireRepository.findAll();
    }

    public Optional<Partenaire> getPartenaireById(long id){
        return partenaireRepository.findById(id);
    }
    public Partenaire savePartenaire(Partenaire partenaire){
        return partenaireRepository.save(partenaire);
    }
    public Partenaire updatePartenaire(long id, Partenaire updatePartenaire){
        if(partenaireRepository.existsById(id)){
            updatePartenaire.setId(id);
            return partenaireRepository.save(updatePartenaire);
        }
        else return null;
    }
    public void deletePartenaire(long id){
        partenaireRepository.deleteById(id);
    }
}
