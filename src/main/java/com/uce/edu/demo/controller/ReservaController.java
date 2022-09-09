package com.uce.edu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.uce.edu.demo.repository.modelo.CompraPasajes;
import com.uce.edu.demo.repository.modelo.Vuelo;
import com.uce.edu.demo.service.IVueloService;

@Controller
@RequestMapping("/reservas")
public class ReservaController {

	@Autowired
	private IVueloService vueloService;
	
	//@Autowired
	//private ICompraPasajesService compraPasajeService;

	@GetMapping("/buscar")
	public String buscarVuelosReserva(Vuelo vuelo) {
		return "vistaDispReserva";
	}

	@GetMapping("/disponibles")
	public String buscarVuelosDisponibles(Model modelo, Vuelo vuelo) {
		List<Vuelo> vuelosDisponibles = this.vueloService.vuelosDisponiblesNumero(vuelo.getNumero());
		modelo.addAttribute("vuelos", vuelosDisponibles);	
		return "vistaDisponiblesReserva";
	}
	
	@PostMapping("/insertar")
	public String insertarReserva(CompraPasajes cp) {
		//this.compraPasajeService.insertar(cp);
		return "redirect:/reservas/vuelos";
	}
	
	@GetMapping("/vuelos")
	public String buscarVuelos(Model modelo, Vuelo vuelo) {
		List<Vuelo> vuelosDisponibles = this.vueloService.vuelos();
		modelo.addAttribute("vuelos", vuelosDisponibles);	
		return "vistaListaVuelos";
	}
}
