package com.infotel.MavenSpringDataMvc.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

import com.infotel.MavenSpringDataMvc.metier.Aerienne;

@Transactional
public interface AerienneRepository extends JpaRepository<Aerienne, Integer> {
 
}
