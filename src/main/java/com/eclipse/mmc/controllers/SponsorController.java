package com.eclipse.mmc.controllers;

import com.eclipse.mmc.entities.Sponsor;
import com.eclipse.mmc.services.ISponsorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/sponsor")
public class SponsorController {
    @Autowired
    private ISponsorService sponsorService;
    @GetMapping("/all")
    public List<Sponsor> getAllSponsor(){
        return sponsorService.getAllSponsor();
    }
    @GetMapping("/by-id/{id}")
    public Optional<Sponsor> getSponsorById(@PathVariable long id){
        return sponsorService.getSponsorById(id);
    }
    @PostMapping("/save")
    public Sponsor saveSponsor(@RequestBody Sponsor sponsor){
        return sponsorService.saveSponsor(sponsor);
    }
    @PutMapping("/update/{id}")
    public Sponsor updateSponsor(@PathVariable long id,@RequestBody  Sponsor updateSponsor){
        return sponsorService.updateSponsor(id,updateSponsor);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteSponsor(@PathVariable long id){
          sponsorService.deleteSponsor(id);
    }
}
