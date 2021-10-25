package com.example.ejercicioManyToMany.modelo;


import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder
@Getter @Setter
public class AddedTo {

    @Builder.Default
    @EmbeddedId
    private AddedToPK id = new AddedToPK();

    @ManyToOne
    @MapsId("song_id")
    @JoinColumn(name="song_id")
    private Song song;

    @ManyToOne
    @MapsId("playlist_id")
    @JoinColumn(name="playlist_id")
    private Playlist playlist;

    private LocalDateTime dateTime;

    private int orden;

    //Helpers

    public void addSong(Song s){
        song = s;
        s.getAddedTo().add(this);
    }
    public void removeSong(Song s){
        song = s;
        s.getAddedTo().remove(this);
    }
    public void addPlaylist(Playlist p){
        playlist = p;
        p.getAddedTo().add(this);
    }
    public void removePlaylist(Playlist p){
        playlist = p;
        p.getAddedTo().remove(this);
    }
    public void addSongPlaylist(Song s, Playlist p){
        addSong(s);
        addPlaylist(p);
    }
    public void removeSongPlaylist(Song s, Playlist p){
        removePlaylist(p);
        removeSong(s);
    }
}
