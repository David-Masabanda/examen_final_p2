package com.uce.edu.demo.service;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Vuelo;

public interface IVueloService {

	public List<Vuelo> vuelosDisponibles(String origen, String destino, String fecha);
	
	public List<Vuelo> vuelosDisponiblesNumero(String numero);
	
	public List<Vuelo> vuelos();
}
