package com.skilldistillery.dndcharacterjpa.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dnd_character")
public class DndCharacter {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	private String name;

	private String job;

	private String race;

	private int strength;

	private int dexterity;

	private int constitution;

	private int intelligence;

	private int wisdom;

	private int charisma;

	private String alignment;

	private String background;

	private String abilities;

	public DndCharacter() {

	}

	public DndCharacter(int id, String name, String job, String race, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.race = race;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
	}

	public DndCharacter(int id, String name, String job, String race, int strength, int dexterity, int constitution,
			int intelligence, int wisdom, int charisma, String alignment, String background, String abilities) {
		super();
		this.id = id;
		this.name = name;
		this.job = job;
		this.race = race;
		this.strength = strength;
		this.dexterity = dexterity;
		this.constitution = constitution;
		this.intelligence = intelligence;
		this.wisdom = wisdom;
		this.charisma = charisma;
		this.alignment = alignment;
		this.background = background;
		this.abilities = abilities;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getConstitution() {
		return constitution;
	}

	public void setConstitution(int constitution) {
		this.constitution = constitution;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public int getWisdom() {
		return wisdom;
	}

	public void setWisdom(int wisdom) {
		this.wisdom = wisdom;
	}

	public int getCharisma() {
		return charisma;
	}

	public void setCharisma(int charisma) {
		this.charisma = charisma;
	}

	public String getAlignment() {
		return alignment;
	}

	public void setAlignment(String alignment) {
		this.alignment = alignment;
	}

	public String getBackground() {
		return background;
	}

	public void setBackground(String background) {
		this.background = background;
	}

	public String getAbilities() {
		return abilities;
	}

	public void setAbilities(String abilities) {
		this.abilities = abilities;
	}

	@Override
	public String toString() {
		return "Dnd Character id: " + id + " Name: " + name + " Class: " + job + " Race: " + race + " Strength: "
				+ strength + " Dexterity: " + dexterity + " Constitution: " + constitution + " Intelligence: "
				+ intelligence + " Wisdom:" + wisdom + " Charisma: " + charisma + " Alignment: " + alignment
				+ " Background: " + background + " Abilities: " + abilities;
	}

}
