package com.eclipse.mmc.entities;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
    @Table(name = "speakers")

    @NoArgsConstructor

    public class Speaker {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        private @Setter @Getter String firstName;
        private @Setter @Getter String lastName;
        private @Setter @Getter String image;
        private @Setter @Getter String bio;
        private @Setter @Getter String lien;
        private @Setter @Getter boolean  isMCT;
        private @Setter @Getter boolean  isMVC;

        @OneToMany(mappedBy="speaker")
        private @Setter @Getter List<Session_Speaker> speaker_sessions;

    }

