package com.cg.NurseryManagement.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.NurseryManagement.entity.Plant;
import com.cg.NurseryManagement.entity.Seed;



public class CustomPlantRepositoryImpl implements CustomPlantRepository {
	@Autowired
	EntityManager entityManager;
	@Override
	public List<Plant> sortByPlantHeight() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from Plant a order By plantHeight ";
		
		Query<Plant> query = session.createQuery(queryString);
		//query.setString("cityName", cityName);
		
		List<Plant>  list = (List<Plant>) query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("plant height Records Not In The DB");
		}
		
	}

	@Override
	public List<Plant> sortByPlantCost() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from Plant a order By plantCost ";
		
		Query<Plant> query = session.createQuery(queryString);
		//query.setString("cityName", cityName);
		
		List<Plant>  list = (List<Plant>) query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("plant cost Records Not In The DB");
		}
	}

	@Override
	public List<Plant> sortByPlantTemp() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from Plant a order By temparature ";
		
		Query<Plant> query = session.createQuery(queryString);
		//query.setString("cityName", cityName);
		
		List<Plant>  list = (List<Plant>) query.getResultList();
		
		// code to fetch data from DB using JPQL
		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("temparature Records Not In The DB");
		}
	}

	@Override
	public List<Plant> getPlantByTemperature(int temp1 , int temp2) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from Plant p where p.temparature >=:qtemp1 and p.temperature<=:qtemp2";
		
		Query<Plant> query = session.createQuery(queryString);
		//query.setString("cityName", cityName);
		
		List<Plant>  list = (List<Plant>) query.getResultList();
		
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
	public List<Plant> veiwAllPlantsbytype(String typeOfPlant) {
Session session=entityManager.unwrap(Session.class); 
		
		String queryString ="from Plant p where p.typeOfPlant=:typeOfPlant";
		
		Query<Plant> query=session.createQuery(queryString);
		query.setString("typeOfPlant",typeOfPlant);
		
		List<Plant> typeOfPlantList = query.getResultList();
		return typeOfPlantList;
	}

	

}
