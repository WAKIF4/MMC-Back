package com.eclipse.mmc.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@NoArgsConstructor
public class Session_Speaker {
    @EmbeddedId
    Session_Speaker_Key id;

//    @JsonBackReference
    @ManyToOne
    @MapsId("Session_id")
    @JoinColumn(name = "session")
    private @Setter @Getter Session session;
//    @JsonBackReference
    @ManyToOne
    @MapsId("Speaker_id")
    @JoinColumn(name = "speaker")
    private @Setter @Getter Speaker speaker;
}
