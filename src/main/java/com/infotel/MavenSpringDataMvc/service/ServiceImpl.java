package com.infotel.MavenSpringDataMvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infotel.MavenSpringDataMvc.dao.AerienneRepository;
import com.infotel.MavenSpringDataMvc.dao.RoutiereRepository;
import com.infotel.MavenSpringDataMvc.dao.SocieteTransportRepository;
import com.infotel.MavenSpringDataMvc.metier.Aerienne;
import com.infotel.MavenSpringDataMvc.metier.Routiere;
import com.infotel.MavenSpringDataMvc.metier.SocieteTransport;


@Service
public class ServiceImpl implements Iservice{
	@Autowired
	private AerienneRepository aerienneRepository;
	@Autowired
	private RoutiereRepository routiereRepository;
	@Autowired
	private SocieteTransportRepository societeTransportRepository;

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

	
	
	@Override
	public SocieteTransport ajouterSocieteTransport(SocieteTransport s) {
		// TODO Auto-generated method stub
		return societeTransportRepository.save(s);
	}

	@Override
	public Optional<SocieteTransport> getSocieteTransport(int idSociete) {
		// TODO Auto-generated method stub
		return societeTransportRepository.findById(idSociete);
	}

	@Override
	public SocieteTransport modifierSocieteTransport(SocieteTransport s) {
		// TODO Auto-generated method stub
		return societeTransportRepository.save(s);
	}

	@Override
	public void supprimerSocieteTransport(int idSociete) {
		// TODO Auto-generated method stub
		societeTransportRepository.deleteById(idSociete);;
	}

	@Override
	public List<SocieteTransport> findAllSocieteTransport() {
		// TODO Auto-generated method stub
		return societeTransportRepository.findAll();
	}

	@Override
	public Routiere ajouterRoutiere(Routiere r) {
		// TODO Auto-generated method stub
		return routiereRepository.save(r);
	}

	@Override
	public Optional<Routiere> getRoutiere(int idCargaison) {
		// TODO Auto-generated method stub
		return routiereRepository.findById(idCargaison);
	}

	@Override
	public Routiere modifierRoutiere(Routiere r) {
		// TODO Auto-generated method stub
		return routiereRepository.save(r);
	}

	@Override
	public void supprimerRoutiere(int idCargaison) {
		// TODO Auto-generated method stub
		routiereRepository.deleteById(idCargaison);;
	}

	@Override
	public List<Routiere> findAllRoutiere() {
		// TODO Auto-generated method stub
		return routiereRepository.findAll();
	}

	@Override
	public Aerienne ajouterAerienne(Aerienne a) {
		// TODO Auto-generated method stub
		return aerienneRepository.save(a);
	}

	@Override
	public Optional<Aerienne> getAerienne(int idCargaison) {
		// TODO Auto-generated method stub
		return aerienneRepository.findById(idCargaison);
	}

	@Override
	public Aerienne modifierAerienne(Aerienne a) {
		// TODO Auto-generated method stub
		return aerienneRepository.save(a);
	}

	@Override
	public void supprimerAerienne(int idCargaison) {
		// TODO Auto-generated method stub
		aerienneRepository.deleteById(idCargaison);;
	}

	@Override
	public List<Aerienne> findAllAerienne() {
		// TODO Auto-generated method stub
		return aerienneRepository.findAll();
	}

}
