package com.seccion4.respo4.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.seccion4.respo4.model.Persona;
@Repository
public class PersonaRepository {
    List<Persona> persona = new ArrayList<>();
    
    public Persona create(Persona p){
        persona.add(p);
        return p;
    }
}
