package com.uce.edu.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.CompraPasajes;

@Repository
@Transactional
public class CompraPasajesRepositoryImpl implements ICompraPasajesRepository{

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public void insertar(CompraPasajes cp) {
		this.entityManager.persist(cp);
		
	}

}
