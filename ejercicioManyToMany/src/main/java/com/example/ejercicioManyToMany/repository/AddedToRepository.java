package com.example.ejercicioManyToMany.repository;

import com.example.ejercicioManyToMany.modelo.AddedTo;
import com.example.ejercicioManyToMany.modelo.AddedToPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddedToRepository extends JpaRepository<AddedTo, AddedToPK> {
}
