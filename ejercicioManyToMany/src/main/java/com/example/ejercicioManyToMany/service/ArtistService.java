package com.example.ejercicioManyToMany.service;

import com.example.ejercicioManyToMany.modelo.Artist;
import com.example.ejercicioManyToMany.repository.ArtistRepository;
import com.example.ejercicioManyToMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class ArtistService extends BaseService<Artist,Long, ArtistRepository> {
}
