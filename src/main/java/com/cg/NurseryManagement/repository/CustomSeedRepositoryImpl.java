package com.cg.NurseryManagement.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;


import com.cg.NurseryManagement.entity.Seed;



public class CustomSeedRepositoryImpl implements CustomSeedRepository {
	@Autowired
	EntityManager entityManager;
	@Override
	public List<Seed> sortBySeedCost() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from Seed a order By seedsCost";
		
		Query<Seed> query = session.createQuery(queryString);
		//query.setString("cityName", cityName);
		
		List<Seed>  list = (List<Seed>) query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Seed name Records Not In The DB");
		}
		
	}

	@Override
	public List<Seed> sortBySeedTemp() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from Seed a order By temparature";
		
		Query<Seed> query = session.createQuery(queryString);
		//query.setString("cityName", cityName);
		
		List<Seed>  list = (List<Seed>) query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("temperature Records Not In The DB");
		}
		
		
	}

	@Override
	public List<Seed> viewListBydifficultyLevel(String difficultyLevel) {
Session session=entityManager.unwrap(Session.class); 
		
		String queryString ="from Seed s where s.difficultyLevel=:difficultyLevel";
		
		Query<Seed> query=session.createQuery(queryString);
		query.setString("difficultyLevel",difficultyLevel);
		
		List<Seed> difficultyLevelList = query.getResultList();
		return difficultyLevelList;
	}

}
