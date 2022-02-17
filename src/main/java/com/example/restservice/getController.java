package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

@RestController
@RequestMapping(value = "/persona")
public class getController {

    @Autowired
    @Qualifier("personas")
    ArrayList<PersonaService> personas;



    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("{id}")
    public String getpersonaID(@PathVariable int id) {

        for(int i = 0; i<personas.size(); i++) {
            if (personas.get(i).getId() == id) {
                return "La persona es " + personas.get(i).getNombre();
            }
        }
         return "No se ha encontrado la persona";


    }

    @GetMapping("nombre/{nombre}")
    public String getpersonanombre(@PathVariable String nombre) {

        for(int i = 0; i<personas.size(); i++) {
            if (personas.get(i).getNombre().equalsIgnoreCase(nombre) ) {
                return "La persona es " + personas.get(i).getNombre();
            }
        }
        return "No se ha encontrado la persona";

    }


}
