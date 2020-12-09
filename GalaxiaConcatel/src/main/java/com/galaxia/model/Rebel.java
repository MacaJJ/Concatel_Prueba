package com.galaxia.model;

public class Rebel {
	
	private String name;
	private String planet;
	private String fechahora;
	
	public Rebel(String name, String planet) {
		this.name = name;
		this.planet = planet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}

	public String getFechahora() {
		return fechahora;
	}

	public void setFechahora(String fechahora) {
		this.fechahora = fechahora;
	}

	@Override
	public String toString() {
		return "rebelde " + name + " en " + planet + " a " + fechahora;
	}	
	
}
