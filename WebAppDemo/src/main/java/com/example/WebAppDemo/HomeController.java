package com.example.WebAppDemo;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	@RequestMapping("home")
	public ModelAndView home(@RequestParam("name") String name) {
		// we can remove req and res and add field I'm expecting and session
		ModelAndView mv= new ModelAndView();
		System.out.println("name is:"+name);
		mv.addObject("name",name);
		mv.setViewName("home");
		return mv;
	}
}
