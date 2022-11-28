package com.tutorial.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.crud.entity.Habilidades;
import com.tutorial.crud.entity.Main;
import com.tutorial.crud.entity.Persona;
import com.tutorial.crud.service.IHabildadesServicio;
import com.tutorial.crud.service.IMainService;
import com.tutorial.crud.service.IPersonaService;

@RestController
public class PersonaController {
    
@Autowired
private IPersonaService interPersona;

@Autowired
private IMainService interMain;

@Autowired
private IHabildadesServicio interHabi; 

@GetMapping("/portfolio")
public List<Persona> listPersona()
{
    return interPersona.getPersonas();
}

@GetMapping("/portfolio/{nombre}")
public  Persona getPersonas(@PathVariable String nombre)
{
    return interPersona.findBynombre(nombre);  
}

@PostMapping("/persona/crear")
public Persona createStudent(@RequestBody Persona perso)
{
    interPersona.savePersona(perso);

    return perso;
}

@PostMapping("/main/crear")
public Main createCabecera(@RequestBody Main main)
{
    interMain.saveMain(main);

    return main;
}

/**
 * @param habilidades
 * @return
 */
@PostMapping("/habilidades/modificar/{id}")
public Habilidades modificarHabilidad(@PathVariable("id")Long id, @RequestBody Habilidades habilidad)
{
 Habilidades editHabi = interHabi.findById(id);
 editHabi.setProgreso(habilidad.getProgreso());
 interHabi.save(editHabi);

 return editHabi;
}

@GetMapping("/habilidad/borrar/{id}")
public void borrarHabilidades(@PathVariable("id")Long id)
{
    interHabi.delete(id);
}

@PostMapping("/habilidad/crear/{nombre}")
public Persona createHabilidad(@RequestBody Habilidades habi, @PathVariable String nombre)
{
    interHabi.save(habi);
    Persona perso = getPersonas(nombre);

    perso.Habilidades.add(0, habi);
    createStudent(perso);

    return (perso);
}

}
