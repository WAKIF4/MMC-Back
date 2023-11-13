package com.eclipse.mmc.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
public class Ville {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;


    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "pays_id")
    private Pays pays;

    public Ville(Long id, String nom , Pays pays) {
        this.id = id;
        this.nom = nom;
        this.pays= pays;
    }

    public Ville() {

    }

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

    public Pays getPays() {
        return pays;
    }

    public void setPays(Pays pays) {
        this.pays = pays;
    }
}
