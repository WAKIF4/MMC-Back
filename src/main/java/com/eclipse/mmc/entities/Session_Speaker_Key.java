package com.eclipse.mmc.entities;

import jakarta.persistence.Embeddable;
import lombok.Setter;

import java.io.Serializable;

@Embeddable

public class Session_Speaker_Key implements Serializable {
     Long Session_id;
     Long Speaker_id;

}
