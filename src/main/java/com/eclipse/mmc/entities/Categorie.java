package com.eclipse.mmc.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@NoArgsConstructor
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Getter Long id;

    private @Getter @Setter String nom;

//    @JsonManagedReference
    @OneToMany(mappedBy = "categorie",fetch = FetchType.EAGER)
    private @Getter @Setter List<Session>sessionList;



}
