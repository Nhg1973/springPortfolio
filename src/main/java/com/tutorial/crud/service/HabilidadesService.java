package com.tutorial.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tutorial.crud.entity.Habilidades;
import com.tutorial.crud.repository.HabilidadesRepository;

@Service
public class HabilidadesService implements IHabildadesServicio{

    @Autowired
    public HabilidadesRepository habiRepo;

    @Override
    public Habilidades findById(Long id) {
        Habilidades habili = habiRepo.findById(id).orElse(null);
        return habili;
    }

    @Override
    public void save(Habilidades editHabi) {
 
        habiRepo.save(editHabi);
        
    }

    @Override
    public void delete(Long id) {
        habiRepo.deleteById(id);
        
    }


        
}
