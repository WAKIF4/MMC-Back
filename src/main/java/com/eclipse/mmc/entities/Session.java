package com.eclipse.mmc.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.time.OffsetTime;
import java.util.List;

@Entity
@NoArgsConstructor


public class Session {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter Long id;

    private @Setter @Getter String titre;
    private @Setter @Getter String description;
    private @Setter @Getter OffsetTime heureDebut;
    private @Setter @Getter OffsetTime heureFin;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "categorie", referencedColumnName = "id")
    private @Setter @Getter Categorie categorie;

    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name="speaker_session",joinColumns=@JoinColumn(name="session_id"),
            inverseJoinColumns = @JoinColumn(name="speaker_id")
    )
    private @Setter @Getter List<Speaker> speakers;
}
