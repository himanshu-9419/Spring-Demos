package com.example.WebAppDemo;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
	@RequestMapping("home")
	public String home(String name,HttpSession session) {
		// we can remove req and res and add field I'm expecting and session
		System.out.println("home "+name);
		session.setAttribute("name", name);
		return "home";
	}
}
