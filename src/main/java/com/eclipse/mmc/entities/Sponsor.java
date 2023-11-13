package com.eclipse.mmc.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "sponsor")
public class Sponsor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter long id;
    private @Getter @Setter String nomEntreprise;
    private @Getter @Setter String adresse;
    private @Getter @Setter String tel;
    private @Getter @Setter long montantSoutien;
    @ManyToMany(mappedBy="sponsorList")
    private @Getter @Setter List<Event> eventList;

    public Sponsor() {
    }

    public Sponsor(String nomEntreprise, String adresse, String tel, long montantSoutien) {
        this.nomEntreprise = nomEntreprise;
        this.adresse = adresse;
        this.tel = tel;
        this.montantSoutien = montantSoutien;
    }
}
