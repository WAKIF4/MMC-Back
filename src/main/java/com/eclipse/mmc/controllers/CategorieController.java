package com.eclipse.mmc.controllers;

import com.eclipse.mmc.entities.Categorie;
import com.eclipse.mmc.services.ICategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("mmc/Categorie")
public class CategorieController {
    @Autowired
    private ICategorieService categorieService;

    @PostMapping("/")
    public Categorie addCategorie(@RequestBody Categorie categorie) {
        return categorieService.addCategorie(categorie);
    }
    @GetMapping("/")
    public List<Categorie> getAll() {
        return categorieService.getAll();
    }
    @GetMapping("/{id}")
    public Optional<Categorie> getById(@PathVariable Long id) {
        return categorieService.getById(id);
    }
    @DeleteMapping("/")
    public void deleteById(@PathVariable Long id) {
        categorieService.deleteById(id);
    }
    @PutMapping("/{id}")
    public int update(@PathVariable Long id,@RequestBody Categorie Categorie) {
        return categorieService.update(id, Categorie);
    }
}
