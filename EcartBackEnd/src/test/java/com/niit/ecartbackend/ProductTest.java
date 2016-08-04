package com.niit.ecartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecartbackend.dao.ProductDAO;
import com.niit.ecartbackend.dao.ProductDAOImpl;
import com.niit.ecartbackend.model.Product;

public class ProductTest {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecartbackend");
		context.refresh();
	ProductDAO productDAO = (ProductDAO)context.getBean("productDAO");
		Product product = (Product)context.getBean("product");
		product.setId("CG12");
		product.setName("CGname120");
		product.setDescription("CGdescription120");
		product.setPrice("125555");
		
		productDAO.saveOrUpdate(product);
	}

}

