package com.niit.ecartbackend.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecartbackend.model.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public CategoryDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate (Category category){
		sessionFactory.getCurrentSession().saveOrUpdate(category);
		
	}
	@Transactional
	public void delete (String id){
		Category categoryToDelete = new Category();
		categoryToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(categoryToDelete);
	}
	@Transactional
	public Category get(String id){
		String hq1 = ("from category where id = "+""+id+"");
				Query query = (Query)sessionFactory.getCurrentSession().createQuery(hq1);
		List<Category> listCategory = (List<Category>)query.getResultList();
		{
			if(listCategory!= null && !listCategory.isEmpty()){
		}
			return listCategory.get(0);
	}
	}
	

	@Transactional
	public List<Category> list() {
		@SuppressWarnings("unchecked")
		List<Category> listCategory = (List<Category>) sessionFactory.getCurrentSession()
		.createCriteria(Category.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listCategory;
	}

}