package com.niit.ecartbackend.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecartbackend.model.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public ProductDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate (Product product){
		sessionFactory.getCurrentSession().saveOrUpdate(product);
		
	}
	@Transactional
	public void delete (String id){
		Product productToDelete = new Product();
		productToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(productToDelete);
	}
	@Transactional
	public Product get(String id){
		String hq1 = ("from product where id = "+""+id+"");
				Query query = (Query)sessionFactory.getCurrentSession().createQuery(hq1);
		List<Product> listProduct = (List<Product>)query.getResultList();
		{
			if(listProduct!= null && !listProduct.isEmpty()){
		}
			return listProduct.get(0);
	}
	}
	

	@Transactional
	public List<Product> list() {
		@SuppressWarnings("unchecked")
		List<Product> listProduct = (List<Product>) sessionFactory.getCurrentSession()
		.createCriteria(Product.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listProduct;
	}

}