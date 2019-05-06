package com.infotel.MavenSpringDataMvc.service;

import java.util.List;

import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.Cargaison;
import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;


public interface Iservice {

	public SocieteTransport ajouterSocieteTransport(SocieteTransport s);
	public SocieteTransport getSocieteTransport(int idSociete);
	public SocieteTransport modifierSocieteTransport(SocieteTransport s);
	public void supprimerSocieteTransport(int idSociete);
	public List<SocieteTransport> findAllSocieteTransport();
	
	public Routiere ajouterRoutiere(Routiere r);
	public Routiere getRoutiere(int idCargaison);
	public Routiere modifierRoutiere(Routiere r);
	public void supprimerRoutiere(int idCargaison);
	public List<Routiere> findAllRoutiere();
	
	public Aerienne ajouterAerienne(Aerienne a);
	public Aerienne getAerienne(int idCargaison);
	public Aerienne modifierAerienne(Aerienne a);
	public void supprimerAerienne(int idCargaison);
	public List<Aerienne> findAllAerienne();
	
	public List<Cargaison> findAllCargaison();
}
