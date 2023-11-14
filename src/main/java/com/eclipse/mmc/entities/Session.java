package com.eclipse.mmc.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name = "event", referencedColumnName = "id")
    private @Setter @Getter Event event;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name = "categorie", referencedColumnName = "id")
    private @Setter @Getter Categorie categorie;
    @OneToMany(mappedBy ="session")
    private @Setter @Getter List<Session_Speaker> session_speakers;
}
