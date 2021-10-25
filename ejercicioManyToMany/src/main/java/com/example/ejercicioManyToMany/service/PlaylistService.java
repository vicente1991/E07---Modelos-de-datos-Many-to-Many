package com.example.ejercicioManyToMany.service;

import com.example.ejercicioManyToMany.modelo.Playlist;
import com.example.ejercicioManyToMany.repository.PlaylistRepository;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService extends BaseService<Playlist,Long, PlaylistRepository> {
}