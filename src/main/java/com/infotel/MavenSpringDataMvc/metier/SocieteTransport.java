package com.infotel.MavenSpringDataMvc.metier;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component; 

@Entity 
@Scope
@Component
public class SocieteTransport {
	
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

private int idSociete;
private String nomSociete; 
private String numSiret;
private Date dateCreation;
public int getIdSociete() {
	return idSociete;
}
public void setIdSociete(int idSociete) {
	this.idSociete = idSociete;
}
public String getNomSociete() {
	return nomSociete;
}
public void setNomSociete(String nomSociete) {
	this.nomSociete = nomSociete;
}
public String getNumSiret() {
	return numSiret;
}
public void setNumSiret(String numSiret) {
	this.numSiret = numSiret;
}
public Date getDateCreation() {
	return dateCreation;
}
public void setDateCreation(Date dateCreation) {
	this.dateCreation = dateCreation;
}



}
