package com.uce.edu.demo.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.repository.modelo.Vuelo;

@Repository
@Transactional
public class VueloRepositoryImpl implements IVueloRepository{

	@PersistenceContext
    private EntityManager entityManager;
	
	@Override
	public List<Vuelo> vuelosDisponibles(String origen, String destino, String fecha) {
		TypedQuery<Vuelo> myQuery =this.entityManager.createQuery(
				"SELECT v FROM Vuelo v WHERE v.origen=:datoOrigen AND v.destino=:datoDestino AND v.fechaVuelo=:datoFecha",
				Vuelo.class);
		myQuery.setParameter("datoOrigen", origen);
		myQuery.setParameter("datoDestino", destino);
		myQuery.setParameter("datoFecha", fecha);
		return myQuery.getResultList();
	}

	@Override
	public List<Vuelo> vuelosDisponiblesNumero(String numero) {
		TypedQuery<Vuelo> myQuery =this.entityManager.createQuery(
				"SELECT v FROM Vuelo v WHERE v.numero=:datoNumero",
				Vuelo.class);
		myQuery.setParameter("datoNumero", numero);
		return myQuery.getResultList();
	}

	@Override
	public List<Vuelo> vuelos() {
		TypedQuery<Vuelo> myQuery =this.entityManager.createQuery(
				"SELECT v FROM Vuelo v ",
				Vuelo.class);
		return myQuery.getResultList();
	}
}
