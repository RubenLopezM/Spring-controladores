package com.example.restservice;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("persona")
public class postController {

    @Autowired
    @Qualifier("personas")
    ArrayList<PersonaService> personas;

    @PostMapping()
    PersonaService añadirPersona(@RequestBody Persona persona){
        PersonaService personaService = new PersonaServiceImp();
        personaService.createPersona(persona);
        personas.add(personaService);
        return personaService;
    }
}
