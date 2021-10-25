package com.example.ejercicioManyToMany.service;

import com.example.ejercicioManyToMany.modelo.Playlist;
import com.example.ejercicioManyToMany.repository.PlaylistRepository;
import com.example.ejercicioManyToMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class PlaylistService extends BaseService<Playlist,Long, PlaylistRepository> {
}