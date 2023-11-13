package com.eclipse.mmc.entities;

import com.eclipse.mmc.entities.enums.TypePartenariat;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "partenaire")
public class Partenaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter long id;
    private @Getter @Setter String nomEntreprise;
    private @Getter @Setter String adresse;
    private @Getter @Setter String numTel;
    @Enumerated(EnumType.STRING)
    private @Getter @Setter TypePartenariat typePartenariat;
    @ManyToMany(mappedBy="partenaireList")
    private @Getter @Setter List<Event> eventList;

    public Partenaire(String nomEntreprise, String adresse, String numTel, TypePartenariat typePartenariat) {
        this.nomEntreprise = nomEntreprise;
        this.adresse = adresse;
        this.numTel = numTel;
        this.typePartenariat = typePartenariat;
    }

    public Partenaire() {
    }

}
