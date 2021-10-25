package com.example.ejercicioManyToMany.modelo;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Getter @Setter
@Builder @AllArgsConstructor @NoArgsConstructor
public class Playlist implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
}
