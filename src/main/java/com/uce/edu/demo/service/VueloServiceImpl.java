package com.uce.edu.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.IVueloRepository;
import com.uce.edu.demo.repository.modelo.Vuelo;

@Service
public class VueloServiceImpl implements IVueloService{

	@Autowired
	private IVueloRepository vueloRepository;
	
	@Override
	public List<Vuelo> vuelosDisponibles(String origen, String destino, String fecha) {
		 List<Vuelo> disponibles=this.vueloRepository.vuelosDisponibles(origen, destino, fecha);
		 List<Vuelo> vuelos=disponibles.stream().filter(estado->estado.getEstado().equals("Disponible")).collect(Collectors.toList());
		return vuelos;
	}

	@Override
	public List<Vuelo> vuelosDisponiblesNumero(String numero) {
		return this.vueloRepository.vuelosDisponiblesNumero(numero);
	}

	@Override
	public List<Vuelo> vuelos() {
		return this.vueloRepository.vuelos();
	}

}
