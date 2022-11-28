package com.tutorial.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.crud.entity.Servicios;



@Repository
public interface ServicioRepository extends JpaRepository<Servicios, Long> {
    
}
