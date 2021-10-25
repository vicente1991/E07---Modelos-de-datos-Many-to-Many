package com.example.ejercicioManyToMany.modelo;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;

@Embeddable
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter
public class AddedToPK implements Serializable{

    private Long song_id;

    private Long playlist_id;

}
