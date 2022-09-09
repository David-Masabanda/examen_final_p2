package com.uce.edu.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.demo.repository.modelo.Vuelo;
import com.uce.edu.demo.service.IVueloService;

@SpringBootApplication
public class ExamenFinalJmApplication implements CommandLineRunner{

	@Autowired
	private IVueloService vueloService;
	
	public static void main(String[] args) {
		SpringApplication.run(ExamenFinalJmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		List<Vuelo> disponibles=this.vueloService.vuelosDisponibles("Ecuador", "Colombia", "10/09/2022");
		disponibles.forEach(valor->System.out.println(valor));
	}

}
