package com.niit.shoppingbackendDAO;

import java.util.List;

import com.niit.shoppingbackendmodel.Register;



public interface RegisterDAO {
	 public List<Register> list();

		public Register get(int id);

		//public void saveOrUpdate(User user);
		
		public void saveOrUpdate(Register register);

		public void delete(int id);
		
		public boolean isValidUser(int id, String name);

	 

}
