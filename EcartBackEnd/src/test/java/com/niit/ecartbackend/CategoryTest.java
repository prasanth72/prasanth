package com.niit.ecartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecartbackend.dao.CategoryDAO;
import com.niit.ecartbackend.dao.CategoryDAOImpl;
import com.niit.ecartbackend.model.Category;

public class CategoryTest {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecartbackend");
		context.refresh();
	CategoryDAO categoryDAO = (CategoryDAO)context.getBean("categoryDAO");
		Category category = (Category)context.getBean("category");
		category.setId("CG120");
		category.setName("CGname120");
		category.setDescription("CGdescription120");
		categoryDAO.saveOrUpdate(category);
	}

}

