package com.skilldistillery.guitarcollection.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Guitar {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "brand_name")
	private String guitarBrand;

	private String model;

	public Guitar() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getGuitarBrand() {
		return guitarBrand;
	}

	public void setGuitarBrand(String guitarBrand) {
		this.guitarBrand = guitarBrand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Guitar [id=" + id + ", guitarBrand=" + guitarBrand + ", model=" + model + "]";
	}

}
