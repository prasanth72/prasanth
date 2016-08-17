package com.niit.shoppingbackendDAO;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.shoppingbackendmodel.User;
import com.niit.shoppingbackendmodel.UserDetails;

@Repository("userDAO")
public class UserDAOImpl implements UserDAO {
	
	
	@Autowired
	private SessionFactory sessionFactory;
	public UserDAOImpl(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	@Transactional
	public void saveOrUpdate(UserDetails userDetails) {
		sessionFactory.getCurrentSession().saveOrUpdate(userDetails);
	}
	@Transactional
	public void delete(int id) {
		UserDetails userDetails =new UserDetails();
		userDetails.setId(id);
		sessionFactory.getCurrentSession().delete(userDetails);
		
	}
	@Transactional
	public UserDetails get(String id) {
		String hql ="from user where id="+"'"+id+"'";
		Query query =(Query) sessionFactory.getCurrentSession().createQuery(hql);
		List<UserDetails> listUserDetails =(List<UserDetails>) query.getResultList();
		if(listUserDetails != null && listUserDetails.isEmpty()){
			return listUserDetails.get(0);
		}	
		return null;
	}
	
@Transactional
	public List<UserDetails> list() {
		@SuppressWarnings({ "unchecked", "deprecation" })
		List<UserDetails> listUserDetails =(List<UserDetails>)
		sessionFactory.getCurrentSession().createCriteria(UserDetails.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		
		return listUserDetails;
	}
@Override
public UserDetails get(int id) {
	// TODO Auto-generated method stub
	return null;
}
		
	

}
