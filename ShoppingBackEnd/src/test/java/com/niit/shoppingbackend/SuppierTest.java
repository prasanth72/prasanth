package com.niit.shoppingbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.shoppingbackendDAO.SupplierDAO;
import com.niit.shoppingbackendmodel.Supplier;

public class SuppierTest {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit");
		context.refresh();
		SupplierDAO supplierDAO = (SupplierDAO) context.getBean("supplierDAO");
		Supplier supplier = (Supplier) context.getBean("supplier");
		supplier.setId("CG120");
		supplier.setName("CGName120");
		supplier.setAddress("CGDesc120");
		supplierDAO.saveOrUpdate(supplier);


	}

}
