package com.tutorial.crud.service;


import com.tutorial.crud.entity.Habilidades;

public interface IHabildadesServicio {

    public Habilidades findById(Long id);

    public void save(Habilidades editHabi);

    public void delete(Long id);


    
}
