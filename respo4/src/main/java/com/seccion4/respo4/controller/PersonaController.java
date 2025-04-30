package com.seccion4.respo4.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.seccion4.respo4.model.Persona;
import com.seccion4.respo4.service.PersonaService;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RequestMapping("/api/personas")
@RestController
public class PersonaController {

    private final PersonaService personaService;

    PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }
    @GetMapping
    public String saludar(){
        return "Holanda";
    }
    @PostMapping
    public Persona guardar(@RequestBody Persona persona){
        return personaService.guardarPersona(persona);
    }
    
    @GetMapping
    public List<Persona> getPersonas(){
        return personaService.listarPersonas();
    }
    
    
    
}
