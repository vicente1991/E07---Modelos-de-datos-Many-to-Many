package com.example.ejercicioManyToMany;

import com.example.ejercicioManyToMany.modelo.Artist;
import com.example.ejercicioManyToMany.modelo.Playlist;
import com.example.ejercicioManyToMany.modelo.Song;
import com.example.ejercicioManyToMany.service.ArtistService;
import com.example.ejercicioManyToMany.service.PlaylistService;
import com.example.ejercicioManyToMany.service.SongService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
@RequiredArgsConstructor
public class MainPrueba {

    private final ArtistService artistService;
    private final SongService songService;
    private final PlaylistService playlistService;


    @PostConstruct
    public void init(){
        Artist artista = Artist.builder()
                .name("Dj Bono")
                .build();
        artistService.save(artista);

        Playlist playlist = Playlist.builder()
                .name("Playlist Titan")
                .description("La mejor")
                .build();
        playlistService.save(playlist);

        Song song = Song.builder()
                .album("Hola")
                .title("Bicharracos")
                .year("1999")
                .build();
        song.addArtist(artista);
        songService.save(song);





    }
}