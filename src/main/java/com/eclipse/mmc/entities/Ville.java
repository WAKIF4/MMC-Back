package com.eclipse.mmc.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
public class Ville {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter Long id;

    private @Setter @Getter String nom;
    @OneToMany(mappedBy = "ville")
    private List<Event>eventList;



    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "pays_id")
    private @Setter @Getter Pays pays;

    public Ville(Long id, String nom , Pays pays) {
        this.id = id;
        this.nom = nom;
        this.pays= pays;
    }




}
