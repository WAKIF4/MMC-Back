package com.eclipse.mmc.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "participant")
@NoArgsConstructor
public class Participant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter @Setter Long id;
    private @Getter @Setter String nom;
    private @Getter @Setter String prenom;
    private @Getter @Setter String email;
    private @Getter @Setter String ecole;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name = "event_id")
    private @Getter @Setter Event event;

    public Participant(String nom, String prenom, String email, String ecole) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.ecole = ecole;
    }
}
