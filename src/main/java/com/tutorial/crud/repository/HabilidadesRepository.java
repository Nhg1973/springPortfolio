package com.tutorial.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tutorial.crud.entity.Habilidades;

@Repository
public interface HabilidadesRepository extends JpaRepository <Habilidades, Long>{
    
}

