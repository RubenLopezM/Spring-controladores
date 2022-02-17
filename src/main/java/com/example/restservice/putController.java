package com.example.restservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("persona")
public class putController {

    @Autowired
    @Qualifier("personas")
    ArrayList <PersonaService> personas;

    @PutMapping("{id}")
    String modificarPersona(@PathVariable int id, @RequestBody Persona persona){
        int position=0;
        for(int i = 0; i<personas.size(); i++) {
            if (personas.get(i).getId() == id) {
                position = i;
                break;
            }
        }

        Optional <String> optNombre=Optional.of(persona.getNombre());
        Optional <String> optPoblacion=Optional.of(persona.getPoblacion());
        Optional <Integer> optEdad=Optional.of(persona.getEdad());

        int finalPosition = position;

        optNombre.ifPresent(x ->personas.get(finalPosition).setNombre(x));
        optPoblacion.ifPresent(x -> personas.get(finalPosition).setPoblacion(x));
        optEdad.ifPresent(x -> personas.get(finalPosition).setEdad(x));

                return "Persona modificada: " + personas.get(finalPosition).getPersona();
    }



}
