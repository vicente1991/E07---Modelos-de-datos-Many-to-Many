package com.example.ejercicioManyToMany.repository;

import com.example.ejercicioManyToMany.modelo.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song,Long> {
}
