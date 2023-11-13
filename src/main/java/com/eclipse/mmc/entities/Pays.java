package com.eclipse.mmc.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;



    @JsonManagedReference
    @OneToMany(mappedBy = "pays", cascade = CascadeType.ALL)
    private List<Ville> villes = new ArrayList<>();

    public Pays(Long id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Pays(){};


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public List<Ville> getVilles() {
        return villes;
    }

    public void setVilles(List<Ville> villes) {
        this.villes = villes;
    }
}
