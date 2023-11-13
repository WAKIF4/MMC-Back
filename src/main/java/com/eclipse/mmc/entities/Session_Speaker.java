package com.eclipse.mmc.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
public class Session_Speaker {
    @EmbeddedId
    Session_Speaker_Key id;

    @ManyToOne
    @MapsId("Session_id")
    @JoinColumn(name = "session")
    private @Setter @Getter Session session;

    @ManyToOne
    @MapsId("Speaker_id")
    @JoinColumn(name = "speaker")
    private @Setter @Getter Speaker speaker;
}
