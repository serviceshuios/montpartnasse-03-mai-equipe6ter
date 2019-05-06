package com.infotel.MavenSpringDataMvc.metier;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GenerationType;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Entity
@Scope
@Component
@DiscriminatorValue("ROUT")
public class Routiere extends Cargaison{
	
	private String immatriculation;
	private double peage;
	public String getImmatriculation() {
		return immatriculation;
	}
	public void setImmatriculation(String immatriculation) {
		this.immatriculation = immatriculation;
	}
	public double getPeage() {
		return peage;
	}
	public void setPeage(double peage) {
		this.peage = peage;
	}
	@Override
	public String toString() {
		return "Routiere [immatriculation=" + immatriculation + ", peage=" + peage + "]";
	}
	
	

}
