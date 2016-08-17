package com.niit.shoppingbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingbackendDAO.CategoryDAO;
import com.niit.shoppingbackendmodel.Category;

public class CategoryTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		CategoryDAO categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
		Category category = (Category) context.getBean("category");
		category.setId("CG120");
		category.setName("CGName120");
		category.setDescription("CGDesc120");
		categoryDAO.saveOrUpdate(category);

		/*if (categoryDAO.get("sdfsf") == null) {
			System.out.println("Category does not exist");
		} else {
			System.out.println("Category exist.....the details are..");
			System.out.println();
		}*/



	}

}
