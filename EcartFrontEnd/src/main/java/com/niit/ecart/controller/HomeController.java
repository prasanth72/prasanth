 package com.niit.ecart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.stereotype.Controller;

@Controller
public class HomeController {
@RequestMapping("/")
public ModelAndView display()
{
	ModelAndView m1= new ModelAndView("Home");
	return m1;
}
@RequestMapping("/Register")
public ModelAndView display1() {
	return new ModelAndView ("Register");
	
}

@RequestMapping("/Login")
public ModelAndView display2() {

	
	ModelAndView mv=new ModelAndView("Login");
	return mv;
}
	
}
