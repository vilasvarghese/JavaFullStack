package com.vilas.fullstackjava.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vilas.fullstackjava.model.CD;

@Repository
public interface CDRepository extends JpaRepository<CD, Long> {
	
	List<CD> findByCdTitle(String cdTitle);
	List<CD> findByCdPublisher(String cdPublisher);

}
