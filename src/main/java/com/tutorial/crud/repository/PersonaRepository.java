package com.tutorial.crud.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.crud.entity.Persona;



@Repository
public interface PersonaRepository extends JpaRepository<Persona ,Long>{

    Persona findByNombre(String nombre);
}
