package com.niit.ecart.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView display()
	{
		ModelAndView m1 = new ModelAndView("Register");
		return m1;
	}
	
	

}
