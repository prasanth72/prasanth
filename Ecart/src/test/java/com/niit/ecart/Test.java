package com.niit.ecart;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecart");
		context.refresh();
		Category c = (Category) context.getBean("category");
		c.setId("101");
		c.setName("car");
		System.out.println(c.getId());
		System.out.println(c.getName());
	}

}
