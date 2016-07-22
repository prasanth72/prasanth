package com.niit.ecartbackend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.ecartbackend.dao.UserDAO;
import com.niit.ecartbackend.dao.UserDAOImpl;
import com.niit.ecartbackend.model.User;

public class UserTest {
	public static void main(String[] args){
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.ecartbackend");
		context.refresh();
	UserDAO userDAO = (UserDAO)context.getBean("userDAO");
		User user = (User)context.getBean("user");
		user.setId("CG120");
		user.setName("NIIT");
		user.setEmail("prashanth@gmail.com");
		user.setPassword("niitampt");
		user.setAddress("Hyderabad");
		user.setMobile("9949446464");
		
		userDAO.saveOrUpdate(user);
	}

}

