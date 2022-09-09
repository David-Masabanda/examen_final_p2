package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.repository.modelo.CompraPasajes;

@Service
public class CompraPasajesServiceImpl implements ICompraPasajesService {

	//@Autowired
	//private ICompraPasajesService compraPasajesRepository;
	
	@Override
	public void insertar(CompraPasajes cp) {
		//this.compraPasajesRepository.insertar(cp);
		
	}

}
