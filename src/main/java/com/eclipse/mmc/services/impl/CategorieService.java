package com.eclipse.mmc.services.impl;

import com.eclipse.mmc.entities.Categorie;
import com.eclipse.mmc.entities.Categorie;
import com.eclipse.mmc.repositories.ICategorieRepository;

import com.eclipse.mmc.services.ICategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategorieService implements ICategorieService {
    @Autowired
    private ICategorieRepository categorieRepository;

    public Categorie addCategorie(Categorie categorie){
        Categorie g=categorieRepository.save(categorie);
        return g;
    }

    public List<Categorie> getAll(){
        List<Categorie>CategorieList=categorieRepository.findAll();
        return CategorieList;
    }
    public Optional<Categorie> getById(Long id){
        Optional<Categorie> Categorie= categorieRepository.findById(id);
        return Categorie;
    }
    public void deleteById(Long id){
        categorieRepository.deleteById(id);
    }
    public int update(Long id,Categorie categorie){
        Optional<Categorie> old=categorieRepository.findById(id);

        if(old.isPresent()){
            Categorie s=old.get();
            s.setNom(categorie.getNom());
            categorieRepository.save(s);
            return 1;
        }
        return -1;
    }

}
