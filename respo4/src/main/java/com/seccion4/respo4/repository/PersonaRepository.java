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
        System.out.println(personas.toString());
        return persona;
    }
    PersonaRepository(){
        personas.add(new Persona(1,"12345678-9","Jimmy","Page",81));
        personas.add(new Persona(2,"87654321-9","Jimi","Hendrix",27));
    }

    public List<Persona> readAll(){
        return personas;
    }

    public Persona read(int id){
        for (Persona persona : personas){
            if(persona.getId()==id){
                return persona;
            }
        }
        return null;
    }
}
