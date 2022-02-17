package com.example.restservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;

@SpringBootApplication
public class EjercicioRs1Application {

	public static void main(String[] args) {

		SpringApplication.run(EjercicioRs1Application.class, args);
	}

	@Bean(name = "personas")
	ArrayList<PersonaService> personas(){
		ArrayList<PersonaService> personas = new ArrayList<>();
		return personas;
	}

}
