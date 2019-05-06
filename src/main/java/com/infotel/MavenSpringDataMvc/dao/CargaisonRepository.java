package com.infotel.MavenSpringDataMvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.MavenSpringDataMvc.metier.Cargaison;


public interface CargaisonRepository extends JpaRepository<Cargaison, Integer> {
	@Transactional
	@Modifying
	@Query("update Cargaison set c.societeTransport.idSociete = ?1 where c.idCargaison = ?2")
	public void ajouterCargaisonSociete(int idSociete, Integer idCargaison);
}



