package com.tutorial.crud.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.crud.entity.Persona;
import com.tutorial.crud.repository.PersonaRepository;


@Service
public class PersonaService implements IPersonaService {

    @Autowired
    public PersonaRepository PersoRepository;

    @Override
    public List<Persona> getPersonas() {
        List<Persona> listaPersonas = PersoRepository.findAll();
        return listaPersonas;
    }

    @Override
    public void savePersona(Persona perso) {
        PersoRepository.save(perso);
        
    }

    @Override
    public void deletePersona(Long id) {
        PersoRepository.deleteById(id);
        
    }

    @Override
    public Persona findPersona(Long id) {
        Persona perso = PersoRepository.findById(id).orElse(null);
        return perso;
    }

    @Override
    public Persona findBynombre(String nombre) {
        Persona perso =PersoRepository.findByNombre(nombre);
        return perso;
    }

        
}
