package com.niit.ecartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecartbackend.dao.SupplierDAO;
import com.niit.ecartbackend.dao.SupplierDAOImpl;
import com.niit.ecartbackend.model.Supplier;

public class SupplierTest {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecartbackend");
		context.refresh();
	SupplierDAO supplierDAO = (SupplierDAO)context.getBean("supplierDAO");
		Supplier supplier = (Supplier)context.getBean("supplier");
		supplier.setId("CG120");
		supplier.setName("Mobiles");
		supplier.setAddress("Hyderabad");
		supplierDAO.saveOrUpdate(supplier);
	}

}

