package com.ftninformatika.dostava.DostavaApp.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.ftninformatika.dostava.DostavaApp.model.Narudzba;

@Repository
public interface NarudzbaRepository extends JpaRepository<Narudzba, Long> {

	Narudzba findOneById(Long id);
	
	@Query("SELECT n FROM Narudzba n WHERE" + 
			"(:mestoIsporuke = NULL OR n.mestoIsporuke LIKE %:mestoIsporuke%) AND " +
			"(:dostavljacId = NULL OR n.dostavljac.id = :dostavljacId)")
	Page<Narudzba> search(
			@Param("mestoIsporuke") String mestoIsporuke,
			@Param("dostavljacId") Long dostavljacId,
			Pageable pageable);
}
