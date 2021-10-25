package com.example.ejercicioManyToMany.modelo;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@AllArgsConstructor @NoArgsConstructor
@Getter @Setter @Builder
public class Song implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    private String tittle;
    private String album;
    private String year;

    @ManyToOne
    @JoinColumn(name = "artista",foreignKey = @ForeignKey(name = "FK_SONG_ARTIST"))
    private Artist artist;



    //HELPERS
    public void addSong(Artist a){
        this.artist=a;
        a.getSongs().add(this);

    }

    public void removeSong(Artist a){
        a.getSongs().remove(this);
        artist=null;
    }


}
