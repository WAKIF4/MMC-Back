package com.eclipse.mmc.services.impl;

import com.eclipse.mmc.entities.Sponsor;
import com.eclipse.mmc.repositories.ISponsorRepository;
import com.eclipse.mmc.services.ISponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SponsorService implements ISponsorService {
    @Autowired
    private ISponsorRepository sponsorRepository;

    public List<Sponsor> getAllSponsor(){
        return sponsorRepository.findAll();
    }

    public Optional<Sponsor> getSponsorById(long id){
        return sponsorRepository.findById(id);
    }
    public Sponsor saveSponsor(Sponsor sponsor){
        return sponsorRepository.save(sponsor);
    }
    public Sponsor updateSponsor(long id, Sponsor updateSponsor){
        if(sponsorRepository.existsById(id)){
            updateSponsor.setId(id);
            return sponsorRepository.save(updateSponsor);
        }
        else return null;
    }
    public void deleteSponsor(long id){
        sponsorRepository.deleteById(id);
    }
}
