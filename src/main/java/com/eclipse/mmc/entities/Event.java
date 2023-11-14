package com.eclipse.mmc.entities;

import com.eclipse.mmc.entities.enums.TypeEvent;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter
    @Setter Long id;
    private @Setter
    @Getter String nom;
    private @Setter
    @Getter String image;
    private @Setter
    @Getter String description;
    private @Setter
    @Getter Date dateDebut;
    private @Setter
    @Getter Date dateFin;
    @Enumerated(EnumType.STRING)
    private @Setter
    @Getter TypeEvent typeEvent;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @JoinColumn(name = "ville", referencedColumnName = "id")
    private @Setter
    @Getter Ville ville;

    private @Setter
    @Getter String adresse;
    @OneToMany(mappedBy = "event", fetch = FetchType.EAGER)

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private @Getter
    @Setter List<Session> session;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private @Setter
    @Getter Long nbdeplace;
    @OneToMany(mappedBy = "event")
    private @Getter
    @Setter List<Participant> participants;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private @Setter
    @Getter List<String> imageList;
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "event_sponsor", joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "sponsor_id")
    )
    private @Setter
    @Getter List<Sponsor> sponsorList;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "event_partenaire", joinColumns = @JoinColumn(name = "event_id"),
            inverseJoinColumns = @JoinColumn(name = "partenaire_id")
    )
    private
    @Setter @Getter List<Partenaire> partenaireList;


    public Event(String nom, String image, String description, Date dateDebut, Date dateFin, TypeEvent typeEvent, Ville ville, String adresse, List<Session> session, Long nbdeplace, List<String> imageList, List<Sponsor> sponsorList) {
        this.nom = nom;
        this.image = image;
        this.description = description;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.typeEvent = typeEvent;
        this.ville = ville;
        this.adresse = adresse;
        this.session = session;
        this.nbdeplace = nbdeplace;
        this.imageList = imageList;
        this.sponsorList = sponsorList;
    }
}
