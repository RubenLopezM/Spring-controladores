package com.example.restservice;

import org.springframework.stereotype.Service;



@Service("bean")
public class PersonaServiceImp implements PersonaService{

    Persona persona = new Persona();

    public void createPersona(Persona persona){
        this.persona.setId(persona.getId());
        this.persona.setNombre(persona.getNombre());
        this.persona.setEdad(persona.getEdad());
        this.persona.setPoblacion(persona.getPoblacion());
    }


    public Persona getPersona() {
        return persona;
    }


    public void setNombre(String nombre){
        persona.setNombre(nombre);
    }


    public void setEdad(int edad){
        persona.setEdad(edad);
    }



    public void setPoblacion(String ciudad){
        persona.setPoblacion(ciudad);
    }



    public int getId(){
        return persona.getId();
    }

    @Override
    public String getNombre() {
        return persona.getNombre();
    }

    public void setId(int id){
        persona.setId(id);
    }

}

