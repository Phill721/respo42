package com.seccion4.respo4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seccion4.respo4.model.Persona;
@Repository
public class PersonaRepository {
    List<Persona> personas = new ArrayList<>();
    
    public Persona create(Persona persona){
        personas.add(persona);
        return persona;
    }

    public List<Persona> readAll(){
        return personas;
    }
}
