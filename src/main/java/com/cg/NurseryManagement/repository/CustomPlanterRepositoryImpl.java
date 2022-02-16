package com.cg.NurseryManagement.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.NurseryManagement.entity.Planter;


public class CustomPlanterRepositoryImpl implements CustomPlanterRepository {
	@Autowired
	EntityManager entityManager;
	@Override
	public List<Planter> sortByPlanterHeight() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from Planter a order By planterheight ";
		
		Query<Planter> query = session.createQuery(queryString);
		//query.setString("cityName", cityName);
		
		List<Planter>  list = (List<Planter>) query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("planter height Records Not In The DB");
		}
	}

	@Override
	public List<Planter> sortByPlanterCost() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from Planter a order By planterCost ";
		
		Query<Planter> query = session.createQuery(queryString);
		//query.setString("cityName", cityName);
		
		List<Planter>  list = (List<Planter>) query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("planter cost Records Not In The DB");
		}
	}

	@Override
	public List<Planter> sortByPlanterShape() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from Planter a order By planterShape ";
		
		Query<Planter> query = session.createQuery(queryString);
		//query.setString("cityName", cityName);
		
		List<Planter>  list = (List<Planter>) query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("planter shape Records Not In The DB");
		}
	}

	@Override
	public List<Planter> sortByPlanterColor() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from Planter a order By planterColor ";
		
		Query<Planter> query = session.createQuery(queryString);
		//query.setString("cityName", cityName);
		
		List<Planter>  list = (List<Planter>) query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("planter color Records Not In The DB");
		}
	}

	@Override
	public List<Planter> listByplanterShape(String planterShape) {
Session session=entityManager.unwrap(Session.class); 
		
		String queryString ="from Planter pl where pl.planterShape=:planterShape";
		
		Query<Planter> query=session.createQuery(queryString);
		query.setString("planterShape",planterShape);
		
		List<Planter> planterShapelist= query.getResultList();
		return planterShapelist;
	}

}
