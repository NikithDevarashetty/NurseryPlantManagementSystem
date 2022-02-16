package com.cg.NurseryManagement.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.NurseryManagement.entity.Customer;



public class CustomAdminRepoImpl implements CustomAdminRepo {

	@Autowired
	EntityManager emanager;
	@Override
	public boolean validate(String username, String password) {
		// TODO Auto-generated method stub
		Session session=emanager.unwrap(Session.class);
		String qstr="from Passengers p where p.user_name=:qname and p.password=:qpass ";
		Query<Customer> query=session.createQuery(qstr);
		query.setString("qname", username);
		query.setString("qpass", password);
		List<Customer> list=(List<Customer>)query.getResultList();
	//	System.out.println(list.size());
		if(list.size()==1)
			return true;
		return false;
		
	}

}
