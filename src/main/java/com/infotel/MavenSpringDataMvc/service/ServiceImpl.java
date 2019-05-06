package com.infotel.MavenSpringDataMvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.MavenSpringDataMvc.dao.AerienneRepository;
import com.infotel.MavenSpringDataMvc.dao.RoutiereRepository;
import com.infotel.MavenSpringDataMvc.dao.CargaisonRepository;
import com.infotel.MavenSpringDataMvc.dao.SocieteTransportRepository;
import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.Cargaison;
import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;

@Service
public class ServiceImpl implements Iservice {
	@Autowired
	private AerienneRepository aerienneRepository;
	@Autowired
	private RoutiereRepository routiereRepository;
	@Autowired
	private SocieteTransportRepository societeTransportRepository;
	@Autowired
	private CargaisonRepository CargaisonRepository;

	public AerienneRepository getAerienneRepository() {
		return aerienneRepository;
	}

	public void setAerienneRepository(AerienneRepository aerienneRepository) {
		this.aerienneRepository = aerienneRepository;
	}

	public RoutiereRepository getRoutiereRepository() {
		return routiereRepository;
	}

	public void setRoutiereRepository(RoutiereRepository routiereRepository) {
		this.routiereRepository = routiereRepository;
	}

	public SocieteTransportRepository getSocieteTransportRepository() {
		return societeTransportRepository;
	}

	public void setSocieteTransportRepository(SocieteTransportRepository societeTransportRepository) {
		this.societeTransportRepository = societeTransportRepository;
	}

	// ++++++++++++++++++++++++++METHODES SOCIETE
	// TRANSPORTS++++++++++++++++++++++++++++++++++++++

	@Override
	public SocieteTransport ajouterSocieteTransport(SocieteTransport s) {
		// TODO Auto-generated method stub
		return societeTransportRepository.save(s);
	}

	@Override
	public SocieteTransport getSocieteTransport(int idSociete) {
		return societeTransportRepository.findById(idSociete).get();
	}

	@Override
	public SocieteTransport modifierSocieteTransport(SocieteTransport s) {
		// TODO Auto-generated method stub
		return societeTransportRepository.save(s);
	}

	@Override
	public void supprimerSocieteTransport(int idSociete) {
		// TODO Auto-generated method stub
		societeTransportRepository.deleteById(idSociete);
		;
	}

	@Override
	public List<SocieteTransport> findAllSocieteTransport() {
		// TODO Auto-generated method stub
		return societeTransportRepository.findAll();
	}

	// ++++++++++++++++++++++++++METHODES CARGAISON
	// ROUTIERE++++++++++++++++++++++++++++++++++++++

	@Override
	public Routiere ajouterRoutiere(Routiere r) {
		// TODO Auto-generated method stub
		return routiereRepository.save(r);
	}

	@Override
	public Routiere getRoutiere(int idCargaison) {

		return routiereRepository.findById(idCargaison).get();
	}

	@Override
	public Routiere modifierRoutiere(Routiere r) {
		// TODO Auto-generated method stub
		return routiereRepository.save(r);
	}

	@Override
	public void supprimerRoutiere(int idCargaison) {
		// TODO Auto-generated method stub
		routiereRepository.deleteById(idCargaison);
		;
	}

	@Override
	public List<Routiere> findAllRoutiere() {
		// TODO Auto-generated method stub
		return routiereRepository.findAll();
	}

	// ++++++++++++++++++++++++++METHODES CARGAISON
	// AERIENNE++++++++++++++++++++++++++++++++++++++

	@Override
	public Aerienne ajouterAerienne(Aerienne a) {
		// TODO Auto-generated method stub
		return aerienneRepository.save(a);
	}

	@Override
	public Aerienne getAerienne(int idCargaison) {
		return aerienneRepository.findById(idCargaison).get();
	}

	@Override
	public Aerienne modifierAerienne(Aerienne a) {
		// TODO Auto-generated method stub
		return aerienneRepository.save(a);
	}

	@Override
	public void supprimerAerienne(int idCargaison) {
		// TODO Auto-generated method stub
		aerienneRepository.deleteById(idCargaison);
		;
	}

	@Override
	public List<Aerienne> findAllAerienne() {
		// TODO Auto-generated method stub
		return aerienneRepository.findAll();
	}

	@Override
	public List<Cargaison> findAllCargaison() {
		// TODO Auto-generated method stub
		return CargaisonRepository.findAll();
	}

	@Override
	public void ajouterCargaisonSociete(int idSociete, Integer idCargaison) {
		CargaisonRepository.ajouterCargaisonSociete(idSociete, idCargaison);
		
	}


	
	
	
	

}
