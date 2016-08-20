package com.niit.shoppingbackendDAO;

import java.util.List;

import com.niit.shoppingbackendmodel.Login;



public interface LoginDAO {
	 public List<Login> list();

		public Login get(int id);

		//public void saveOrUpdate(User user);
		
		public void save(Login login);
		public void Update(Login login);

		public void delete(int id);
		
		public boolean isValidUser(int id, String name);

	 

}
