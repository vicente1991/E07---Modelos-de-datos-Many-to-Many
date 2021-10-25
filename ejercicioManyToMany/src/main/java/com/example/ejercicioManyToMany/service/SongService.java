package com.example.ejercicioManyToMany.service;

import com.example.ejercicioManyToMany.modelo.Song;
import com.example.ejercicioManyToMany.repository.SongRepository;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song, Long, SongRepository> {
}