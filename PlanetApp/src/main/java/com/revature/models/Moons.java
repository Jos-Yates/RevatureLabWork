package com.revature.models;

public class Moons {

	private String name;
	private double mass;
	private double radius;
	private boolean atmosphere;
		
	public Moons() {
		super();
	}
	
	public Moons(String name, double mass, double radius, boolean atmosphere) {
		//super();
		this.name = name;
		this.mass = mass;
		this.radius = radius;
		this.atmosphere = atmosphere;
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMass() {
		return mass;
	}

	public void setMass(double mass) {
		this.mass = mass;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public boolean isAtmosphere() {
		return atmosphere;
	}

	public void setAtmosphere(boolean atmosphere) {
		this.atmosphere = atmosphere;
	}
	}
