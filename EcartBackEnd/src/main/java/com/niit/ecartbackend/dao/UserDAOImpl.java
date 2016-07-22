package com.niit.ecartbackend.dao;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.ecartbackend.model.User;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public UserDAOImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Transactional
	public void saveOrUpdate (User user){
		sessionFactory.getCurrentSession().saveOrUpdate(user);
		
	}
	@Transactional
	public void delete (String id){
		User userToDelete = new User();
		userToDelete.setId(id);
		sessionFactory.getCurrentSession().delete(userToDelete);
	}
	@Transactional
	public User get(String id){
		String hq1 = ("from user where id = "+""+id+"");
				Query query = (Query)sessionFactory.getCurrentSession().createQuery(hq1);
		List<User> listUser = (List<User>)query.getResultList();
		{
			if(listUser!= null && !listUser.isEmpty()){
		}
			return listUser.get(0);
	}
	}
	

	@Transactional
	public List<User> list() {
		@SuppressWarnings("unchecked")
		List<User> listUser = (List<User>) sessionFactory.getCurrentSession()
		.createCriteria(User.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listUser;
	}

}