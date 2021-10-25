package com.example.ejercicioManyToMany.service;

import com.example.ejercicioManyToMany.modelo.AddedTo;
import com.example.ejercicioManyToMany.modelo.AddedToPK;
import com.example.ejercicioManyToMany.modelo.Playlist;
import com.example.ejercicioManyToMany.modelo.Song;
import com.example.ejercicioManyToMany.repository.AddedToRepository;
import com.example.ejercicioManyToMany.service.base.BaseService;
import org.springframework.stereotype.Service;

@Service
public class AddedToService extends BaseService<AddedTo, AddedToPK, AddedToRepository> {


    public Playlist AniadirCancion(Playlist p, Song s){
        s.getAddedTo().forEach(cancion ->{
            AddedTo a = AddedTo.builder()
                    .song(s)
                    .playlist(p)
                    .build();
            save(a);
        });

        return p;
    }
}
