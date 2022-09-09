package com.uce.edu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.demo.repository.modelo.Vuelo;
import com.uce.edu.demo.service.IVueloService;

@Controller
@RequestMapping("/vuelos")
public class VueloController {

	@Autowired
	private IVueloService vueloService;

	@GetMapping("/buscar")
	public String buscarVuelos(Vuelo vuelo) {
		return "vistaBuscar";
	}

	@GetMapping("/buscarDisponibles")
	public String buscarVuelosDisponibles(Model modelo, Vuelo vuelo) {
		List<Vuelo> vuelosDisponibles = this.vueloService.vuelosDisponibles(vuelo.getOrigen(), vuelo.getDestino(),vuelo.getFechaVuelo());
		modelo.addAttribute("vuelos", vuelosDisponibles);	
		return "vistaDisponibles";
	}

	
}
