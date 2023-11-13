package com.eclipse.mmc.controllers;

import com.eclipse.mmc.entities.Pays;
import com.eclipse.mmc.services.impl.PaysServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pays")
public class PaysController {

    private PaysServiceImpl paysServiceImpl;

    public PaysController(PaysServiceImpl paysServiceImpl) {
        this.paysServiceImpl = paysServiceImpl;
    }

    @GetMapping("/")
    public List<Pays> getAllPays() {
        return paysServiceImpl.getAllPays();
    }

    @GetMapping("/{id}")
    public Pays getPaysById(@PathVariable Long id) {
        return paysServiceImpl.getPaysById(id).orElse(null);
    }

    @PostMapping
    public Pays savePays(@RequestBody Pays pays) {
        return paysServiceImpl.savePays(pays);
    }

    @DeleteMapping("/{id}")
    public void deletePays(@PathVariable Long id) {
        paysServiceImpl.deletePays(id);
    }
}
