package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.AlienRepo;
import com.example.demo.model.Alien;

@RestController
public class AlienController {
	
	@Autowired
	AlienRepo repo;
	
//	@RequestMapping("/")
//	public String home() {
//		return "home.jsp";
//	}
//	@RequestMapping("/addAlien")
//	public String addAlien(Alien alien) {
//		repo.save(alien);
//		return "home.jsp";
//	}
	
	@RequestMapping("/getAlien")
	public ModelAndView addAlien(@RequestParam Integer aid) {
		ModelAndView mv=new ModelAndView("showAlien.jsp");
		Alien alien=repo.findById(aid).orElse(new Alien());
		System.out.println(repo.findByTech("js"));
		System.out.println(repo.findAllByAidGreaterThan(aid));
		System.out.println(repo.findAllByTechSorted("js"));
		mv.addObject(alien);
		return mv;
	}
	
	@RequestMapping(path="/aliens",produces={"application/json"})
	public List<Alien> getAlien() {
		return repo.findAll();
	}
	
	@RequestMapping("/alien/{aid}")
	public Optional<Alien> getAlien(@PathVariable("aid") int aid) {
		return repo.findById(aid);
	}
	
	@RequestMapping(path="/alien",method=RequestMethod.POST)
	public Alien addAlien(@RequestBody Alien alien) {
		System.out.println(alien.toString());
		repo.save(alien);
		return alien;
	}
}
