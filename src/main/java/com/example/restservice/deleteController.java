package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("persona")
public class deleteController {

    @Autowired
    @Qualifier("personas")
    ArrayList<PersonaService> personas;

    @DeleteMapping("{id}")
    String borrarpersona(@PathVariable int id, @RequestBody Persona persona){
        int position=0;
        for(int i = 0; i<personas.size(); i++) {
            if (personas.get(i).getId() == id) {
                position = i;
                break;
            }
        }
        personas.remove(position);

        return "Se ha borrado la persona con id "+id;

    }
}
