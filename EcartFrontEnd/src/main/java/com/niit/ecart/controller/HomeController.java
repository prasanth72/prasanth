package com.niit.ecart.controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.ecartbackend.dao.ProductDAOImpl;
import com.niit.ecartbackend.model.Product;

import javax.servlet.http.HttpServletRequest;

import org.hibernate.validator.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;

@Controller
public class HomeController
{
	@Autowired
	private ProductDAOImpl pd;
	@RequestMapping("/")
	public ModelAndView display() 
	{
		ModelAndView m1 = new ModelAndView("Home");
		return m1;
	}

	@RequestMapping("/Register")
	public ModelAndView display1() {
		return new ModelAndView("Register");

	}

	@RequestMapping("/Login")
	public ModelAndView display2() {

		ModelAndView mv = new ModelAndView("Login");
		return mv;
	}

	@RequestMapping("/addwatch")
	public ModelAndView display3() {

		ModelAndView m1 = new ModelAndView("addwatch");
		return m1;
	}

	@ModelAttribute("product")
	public Product addwatch()
	{
		return new Product();
	}
	
	 @RequestMapping(value="storepro",method=RequestMethod.POST)
	    public String addProu(HttpServletRequest request,@Valid @ModelAttribute("product")Product product,BindingResult result)
	           {
		 System.out.println("hello niit...........................");
	        	if(result.hasErrors())
	        	{
	        		return "addwatch";
	        	}
	        	System.out.println(product.getId());
	        	System.out.println(product.getName());
	        	System.out.println(product.getDescription());
	        	System.out.println(product.getPrice());
	        	pd.saveOrUpdate(product);
	        	 	return "addwatch";
	           }
}