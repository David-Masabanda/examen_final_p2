package com.uce.edu.demo.repository;

import java.util.List;

import com.uce.edu.demo.repository.modelo.Vuelo;

public interface IVueloRepository {

	public List<Vuelo> vuelosDisponibles(String origen, String destino, String fecha);
	public List<Vuelo> vuelosDisponiblesNumero(String numero);
	public List<Vuelo> vuelos();
	
}
