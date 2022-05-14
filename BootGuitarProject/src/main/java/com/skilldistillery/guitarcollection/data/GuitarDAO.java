package com.skilldistillery.guitarcollection.data;

import java.util.List;

import com.skilldistillery.guitarcollection.entities.Guitar;

public interface GuitarDAO {
	
	public Guitar findById(int id);
	
	public List<Guitar> findAll();

}
