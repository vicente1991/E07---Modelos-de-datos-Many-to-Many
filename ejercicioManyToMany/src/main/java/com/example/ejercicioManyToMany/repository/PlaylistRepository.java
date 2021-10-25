package com.example.ejercicioManyToMany.repository;

import com.example.ejercicioManyToMany.modelo.Playlist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaylistRepository extends JpaRepository<Playlist, Long> {
}
