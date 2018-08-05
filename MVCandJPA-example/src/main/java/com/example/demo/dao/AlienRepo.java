package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Alien;

public interface AlienRepo extends CrudRepository<Alien, Integer> {
	List<Alien> findByTech(String tech);
	List<Alien> findAllByAidGreaterThan(Integer aid);
	
	@Query("from Alien where tech=?1 order by aName")
	List<Alien> findAllByTechSorted(String tech);
}
