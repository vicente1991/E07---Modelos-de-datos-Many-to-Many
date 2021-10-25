package com.example.ejercicioManyToMany.modelo;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter
@Builder @AllArgsConstructor @NoArgsConstructor
public class Playlist implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;

    @Builder.Default
    @OneToMany(mappedBy = "playlist")
    private List<AddedTo> addedTo = new ArrayList<>();
}
