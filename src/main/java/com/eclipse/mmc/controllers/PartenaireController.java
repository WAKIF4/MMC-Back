package com.eclipse.mmc.controllers;

import com.eclipse.mmc.entities.Partenaire;
import com.eclipse.mmc.services.IPartenaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/partenaire")
public class PartenaireController {
    @Autowired
    private IPartenaireService partenaireService;
    @GetMapping("/all")
    public List<Partenaire> getAll(){
        return partenaireService.getAllPartenaire();
    }
    @GetMapping("/by-id/{id}")
    public Optional<Partenaire> getPartenaireById(@PathVariable long id){
        return partenaireService.getPartenaireById(id);
    }
    @PostMapping("/save")
    public Partenaire savePartenaire(@RequestBody Partenaire partenaire){
        return partenaireService.savePartenaire(partenaire);
    }
    @PutMapping("/update/{id}")
    public Partenaire updatePartenaire(@PathVariable long id,@RequestBody Partenaire updatePartenaire){
        return partenaireService.updatePartenaire(id,updatePartenaire);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteById(@PathVariable Long id){
        partenaireService.deletePartenaire(id);
    }

}
