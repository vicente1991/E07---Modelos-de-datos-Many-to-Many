package com.example.ejercicioManyToMany.service;

import com.example.ejercicioManyToMany.modelo.Song;
import com.example.ejercicioManyToMany.repository.SongRepository;
import com.example.ejercicioManyToMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class SongService extends BaseService<Song, Long, SongRepository> {
}