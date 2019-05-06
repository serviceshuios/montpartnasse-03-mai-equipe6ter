package com.infotel.MavenSpringDataMvc.service;

import java.util.List;
import java.util.Optional;

import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;

public interface Iservice {

	public SocieteTransport ajouterSocieteTransport(SocieteTransport s);
	public Optional<SocieteTransport> getSocieteTransport(int idSociete);
	public SocieteTransport modifierSocieteTransport(SocieteTransport s);
	public void supprimerSocieteTransport(SocieteTransport s);
	public List<SocieteTransport> findAllSocieteTransport();
	
	public Routiere ajouterRoutiere(Routiere r);
	public Optional<Routiere> getRoutiere(int idCargaison);
	public Routiere modifierRoutiere(Routiere r);
	public void supprimerRoutiere(Routiere r);
	public List<Routiere> findAllRoutiere();
	
	public Aerienne ajouterAerienne(Aerienne a);
	public Optional<Aerienne> getAerienne(int idCargaison);
	public Aerienne modifierAerienne(Aerienne a);
	public void supprimerAerienne(Aerienne a);
	public List<Aerienne> findAllAerienne();
}
