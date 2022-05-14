package com.skilldistillery.guitarcollection.data;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.skilldistillery.guitarcollection.entities.Guitar;

@Service
@Transactional
public class GuitarDAOImp implements GuitarDAO {
	
	@PersistenceContext
	private EntityManager em;
	
	
	@Override
	public Guitar findById(int id) {
		
		return em.find(Guitar.class, id);
	}

	@Override
	public List<Guitar> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
