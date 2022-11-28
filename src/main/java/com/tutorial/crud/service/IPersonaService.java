package com.tutorial.crud.service;

import java.util.List;
import com.tutorial.crud.entity.Persona;


public interface IPersonaService {

    public List<Persona> getPersonas();

    public void savePersona(Persona  perso);

    public void deletePersona (Long id);

    public Persona findPersona( Long id);

    public Persona findBynombre(String nombre);
    

 
}