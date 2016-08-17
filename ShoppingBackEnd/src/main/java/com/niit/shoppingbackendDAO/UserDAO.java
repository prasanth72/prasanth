package com.niit.shoppingbackendDAO;

import java.util.List;

import com.niit.shoppingbackendmodel.User;
import com.niit.shoppingbackendmodel.UserDetails;

public interface UserDAO {
	public List<UserDetails> list();
	public UserDetails get(int id);
	public void saveOrUpdate(UserDetails userDetails);
	public void delete(int id);
}
