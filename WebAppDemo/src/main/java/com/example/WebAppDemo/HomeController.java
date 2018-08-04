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
	public String home(HttpServletRequest req,HttpServletResponse res) {
		String name=req.getParameter("name");
		System.out.println("home "+name);
		HttpSession session= req.getSession();
		session.setAttribute("name", name);
		return "home";
	}
}