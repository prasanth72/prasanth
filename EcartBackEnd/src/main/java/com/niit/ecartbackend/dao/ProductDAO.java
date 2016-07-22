package com.niit.ecartbackend.dao;

import java.util.List;

import com.niit.ecartbackend.model.Product;



public interface ProductDAO {
	public List <Product> list();
	public Product get(String id);
	public void saveOrUpdate(Product product);
	public void delete(String id);

}
