package com.example.ejercicioManyToMany.repository;

import com.example.ejercicioManyToMany.modelo.Artist;
import com.example.ejercicioManyToMany.modelo.Song;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface ArtistRepository extends JpaRepository<Artist, Long> {

    List<Artist> findbySong(Song song);
}
