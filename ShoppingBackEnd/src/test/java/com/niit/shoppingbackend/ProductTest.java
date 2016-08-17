package com.niit.shoppingbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingbackendDAO.ProductDAO;
import com.niit.shoppingbackendmodel.Product;

public class ProductTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		ProductDAO productDAO = (ProductDAO) context.getBean("productDAO");
		Product product = (Product) context.getBean("product");
		product.setId(120);
		product.setName("CGName120");
		product.setDescription("CGDesc120");
		product.setPrice(100);
		productDAO.saveOrUpdate(product);

		/*if (productDAO.get("sdfsf") == null) {
			System.out.println("Product does not exist");
		} else {
			System.out.println("Product exist.....the details are..");
			System.out.println();
		}*/



	}

}
