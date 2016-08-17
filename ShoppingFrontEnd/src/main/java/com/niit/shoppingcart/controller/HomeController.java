 package com.niit.shoppingcart.controller;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.annotation.RequestScope;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.shoppingbackendDAO.ProductDAO;
import com.niit.shoppingbackendDAO.UserDAO;
import com.niit.shoppingbackendmodel.Product;
import com.niit.shoppingbackendmodel.User;
import com.niit.shoppingbackendmodel.UserDetails;

@Controller

public class HomeController
{ 
	@Autowired
	ProductDAO pd;
	@Autowired
	UserDAO us;
	
	
		SessionFactory sessionFactory;
	@RequestMapping("/")
	public ModelAndView display() {
		ModelAndView m1 = new ModelAndView("index");
		return m1;
	}
 
	@RequestMapping("Login")
	public ModelAndView display1() {
		ModelAndView m2 = new ModelAndView("Login");
		return m2;
	}

	@RequestMapping("register")
	public ModelAndView display2() {
		ModelAndView m3 = new ModelAndView("register");
		return m3;
	}
	
	@RequestMapping("addproduct")
	public ModelAndView display4() {
		ModelAndView m4 = new ModelAndView("addproduct");
		return m4;
	}

	@ModelAttribute("Product")
    public Product createProduct()
    {
    	return new Product();
    }
	@ModelAttribute("UserDetails")
    public UserDetails createuser()
    {
    	return new UserDetails();
    }
	@RequestMapping("storeproduct")
    public String addmobile(HttpServletRequest request,@Valid @ModelAttribute("Product")Product product,BindingResult result)
           {
	 System.out.println("hello niit...........................");
	 System.out.println(product.getId());
 	System.out.println(product.getName());
 	System.out.println(product.getDescription());
 	System.out.println(product.getPrice());
 	System.out.println(product.getImg());
        	if(result.hasErrors())
        	{
        		return "addproduct";
        	}
        	System.out.println(product);
        	String filename=product.getImg().getOriginalFilename();
        			//product.getImg().getOriginalFilename();
        	System.out.println("Shanth..........."+filename);
        	product.setImage(filename);
        	
        	try{
        		byte[] bytes=new byte[product.getImg().getInputStream().available()];
        		System.out.println("one");
        		product.getImg().getInputStream().read(bytes);
        		System.out.println("two");
        		BufferedInputStream buffer=new BufferedInputStream(product.getImg().getInputStream());
        		System.out.println("three");
        		MultipartFile file=product.getImg();
           		String path=request.getServletContext().getRealPath("/")+"resources/images";
        		
        		File rootPath=new File(path);
        		
        		if(!rootPath.exists())
        			rootPath.mkdirs();
        		
        		File store=new File(rootPath.getAbsolutePath()+"/"+filename);
        		
        		System.out.println("Image path :"+path);
        		
        		OutputStream pd=new FileOutputStream(store);
        		
        		pd.write(bytes);
        	}
        	catch(Exception e){
        		System.out.println(e.getMessage());
        	}
        	  	pd.saveOrUpdate(product);
        	        	
        	return "addproduct";
           }

	 

    @RequestMapping (value="/storeuser",method =RequestMethod.POST)
    		public String addUser(@Valid @ModelAttribute("userDetails")UserDetails userDetails,BindingResult result, Model model){
       	
    	if(result.hasErrors()) {
    		
    		return "index";
    	}
    	
    	System.out.println("hello storeUser");
    	System.out.println(userDetails.getUserName()+ "hello @@@@@@");
    	us.saveOrUpdate(userDetails);
    	return "index";
       }

	
	 
	@RequestMapping("hai")
	public String display3()
	{
		return "index";
	}
	
	@RequestMapping("/index2")
	public ModelAndView display6(HttpServletRequest request)
	{ 
		String str=request.getParameter("email");
		//System.out.println(email);
		//HttpSession ses=request.getSession(true);
		//ses.setAttribute("aaa",email);
		ModelAndView m1=new ModelAndView("index2");
		return m1;
	}
	@RequestMapping("retrieve")
	public ModelAndView retriveRecords()
	{  
		ModelAndView m1=new ModelAndView("retrieve");
		return m1;
	}
	
@RequestMapping(value="list",method=RequestMethod.GET,produces="application/json")
	    public @ResponseBody String showList(){
	    	List list=pd.list();
	    	Gson x=new Gson();
	    	String json=x.toJson(list);
	    	return json;
	    }

@RequestMapping(value="ViewProduct",method=RequestMethod.GET)
		    public ModelAndView viewProduct(@RequestParam int id, @ModelAttribute Product products){
		    	Product product=pd.get(id);
		    	return new ModelAndView("ViewProduct","product",product);
		    	//return new ModelAndView("ViewProduct");
		    }
@RequestMapping("editproduct")
public ModelAndView display5()
{
	ModelAndView m6 = new ModelAndView("editproduct");
	return m6;
}
@RequestMapping(value="editproduct",method=RequestMethod.GET)
public ModelAndView editproduct(@RequestParam int id){
 System.out.println("hello niit.........................niit1............");	
 Product product1=pd.get(id);
 System.out.println("hello niit.........................niit2............");
 System.out.println("eeee" +product1.getName());
	return new ModelAndView("editproduct","Product",product1);
}
@RequestMapping(value="/editproduct",method=RequestMethod.POST)
public ModelAndView updateProduct(HttpServletRequest request,@Valid @ModelAttribute("product")Product product,BindingResult result)
{
	
	String filename=product.getImg().getOriginalFilename();
	
	product.setImage(filename);
	
	try{
		byte[] bytes=new byte[product.getImg().getInputStream().available()];
		product.getImg().getInputStream().read(bytes);
		BufferedInputStream buffer=new BufferedInputStream(product.getImg().getInputStream());
		MultipartFile file=product.getImg();
		String path=request.getServletContext().getRealPath("/")+"resources/images";
		File rootPath=new File(path);
		if(!rootPath.exists())
			rootPath.mkdirs();
		File store=new File(rootPath.getAbsolutePath()+"/"+filename);
		System.out.println("Image path :"+path);
		OutputStream os=new FileOutputStream(store);
		os.write(bytes);
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
		        
	pd.saveOrUpdate(product);
	return new ModelAndView("retrive");
}

@RequestMapping("/delete")
public ModelAndView deleteProduct(@RequestParam int id)
{
	 System.out.println("hello welcome to niit");
	    pd.deleteProduct(id);
	ModelAndView model=new ModelAndView("retrieve");
	return model;
}
	
}