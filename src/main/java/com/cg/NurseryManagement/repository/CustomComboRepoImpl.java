package com.cg.NurseryManagement.repository;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;

import com.cg.NurseryManagement.entity.Combo;

public class CustomComboRepoImpl implements CustomComboRepo {

	@Autowired
	EntityManager entityManager;
	

	@Override
	public List<Combo> findComboByComboId(int comboId) {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		String queryString = "from combo a order By GifId " ;
		Query <Combo> query = session.createQuery(queryString);
		List<Combo> list = (List<Combo>) query.getResultList();
		if(list != null)
		{
			return list;
		}
		else {
			throw new javax.persistence.NoResultException("gift id Records Not In The DB");
	}
		
	}


	

/*	

	@Override
	public List<Combo> getComboByPlantwithchoclatecombo() {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Session session = entityManager.unwrap(Session.class);
				// select * from AccountTable where cityName = 'dffd';
				String queryString = "from Combo a order By Plantwithchoclatecombo ";
				
				 Query<Combo> query = session.createQuery(queryString);
				//query.setString("cityName", cityName);
				
				List<Combo>  list = (List<Combo>) query.getResultList();

				
				if(list != null)
				{
					return list;
				}
				else
				{
					throw new javax.persistence.NoResultException("Plantwithchoclatecomboname Records Not In The DB");
				}
				
			}

	@Override
	public List<Combo> getComboByPlanterwithchoclatecombo() {
		// TODO Auto-generated method stub
		Session session = entityManager.unwrap(Session.class);
		// select * from AccountTable where cityName = 'dffd';
		String queryString = "from Combo a order By Planterwithchoclatecombo ";
		
		 Query<Combo> query = session.createQuery(queryString);
		//query.setString("cityName", cityName);
		
		List<Combo>  list = (List<Combo>) query.getResultList();

		
		if(list != null)
		{
			return list;
		}
		else
		{
			throw new javax.persistence.NoResultException("Planterwithchoclatecombo name Records Not In The DB");
		}
		
	}

	@Override
	public List<Combo> sortByComboCost() {
			// TODO Auto-generated method stub
			Session session = entityManager.unwrap(Session.class);

			String queryString = "from Combo a order By comboCost ";
			
			Query<Combo> query = session.createQuery(queryString);
			//query.setString("cityName", cityName);
			
			List<Combo>  list = (List<Combo>) query.getResultList();
			
			// code to fetch data from DB using JPQL
			
			if(list != null)
			{
				return list;
			}
			else
			{
				throw new javax.persistence.NoResultException("Combocost name Records Not In The DB");
			}
			
		}


*/
	
	

}
