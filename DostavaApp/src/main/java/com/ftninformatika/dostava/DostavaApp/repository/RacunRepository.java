package com.ftninformatika.dostava.DostavaApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ftninformatika.dostava.DostavaApp.model.Racun;

@Repository
public interface RacunRepository extends JpaRepository<Racun, Long> {
	
	Racun findOneById(Long id);

}
