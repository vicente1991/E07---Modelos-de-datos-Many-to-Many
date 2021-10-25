package com.example.ejercicioManyToMany.modelo;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder
public class Song implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String title;
    private String album;
    private String year;

    @ManyToOne
    @JoinColumn(name = "artista",foreignKey = @ForeignKey(name = "FK_SONG_ARTIST"))
    private Artist artist;

    @Builder.Default
    @OneToMany(mappedBy = "song")
    private List<AddedTo> addedTo = new ArrayList<>();

    //HELPERS
    public void addArtist(Artist a){
        artist = a;
        if (a.getSongs() == null){
            a.setSongs(new ArrayList<>());
            a.getSongs().add(this);
        }

    }

    public void removeArtist(Artist a){
        a.getSongs().remove(this);
        artist=null;
    }


}
