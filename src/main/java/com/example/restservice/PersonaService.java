package com.example.restservice;

public interface PersonaService {

    int getId();
    String getNombre();
    void setNombre(String nombre);
    void setPoblacion(String ciudad);
    void setEdad(int edad);
    void setId(int id);
    void createPersona(Persona persona);
    Persona getPersona();


}
