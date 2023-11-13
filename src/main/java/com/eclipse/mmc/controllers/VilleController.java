package com.eclipse.mmc.controllers;

import com.eclipse.mmc.entities.Pays;
import com.eclipse.mmc.entities.Ville;
import com.eclipse.mmc.services.impl.PaysServiceImpl;
import com.eclipse.mmc.services.impl.VilleServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/villes")
public class VilleController {
    private VilleServiceImpl villeServiceImpl;
    private PaysServiceImpl paysServiceImpl;

    public VilleController(VilleServiceImpl villeServiceImpl) {
        this.villeServiceImpl = villeServiceImpl;
    }

    @GetMapping("/")
    public List<Ville> getAllVilles() {
        return villeServiceImpl.getAllVilles();
    }

    @GetMapping("/{id}")
    public Ville getVilleById(@PathVariable Long id) {
        return villeServiceImpl.getVilleById(id).orElse(null);
    }

    @GetMapping("/pays/{paysId}")
    public ResponseEntity<List<Ville>> getVillesByPays(@PathVariable Long paysId) {
        Pays pays = paysServiceImpl.getPaysById(paysId).orElse(null);

        if (pays == null) {
            return ResponseEntity.notFound().build();
        }

        List<Ville> villes = villeServiceImpl.getVillesByPays(pays);
        return ResponseEntity.ok(villes);
    }

    @PostMapping
    public Ville saveVille(@RequestBody Ville ville) {
        return villeServiceImpl.saveVille(ville);
    }

    @DeleteMapping("/{id}")
    public void deleteVille(@PathVariable Long id) {
        villeServiceImpl.deleteVille(id);
    }
}
