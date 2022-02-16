package com.cg.NurseryManagement.service;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.NurseryManagement.dto.CustomerBasicInfoDTO;
import com.cg.NurseryManagement.dto.CustomerSavePostDTO;
import com.cg.NurseryManagement.entity.Customer;
import com.cg.NurseryManagement.repository.IAdminRepository;
import com.cg.NurseryManagement.util.CustomerDtoConvertionClass;

@Service
public class IAdminServiceImpl implements IAdminService {
	@Autowired
	IAdminRepository repository;
	@Autowired
	CustomerDtoConvertionClass dtoConvertion;
	@Override
	public Customer getCustomerInfo(int customerid) {
		// TODO Auto-generated method stub
		return repository.findById(customerid).get();
	}

	@Override
	public List<Customer> getCustomerList() {
		// TODO Auto-generated method stub
		return (List<Customer>) repository.findAll();
	}

	@Override
	public CustomerBasicInfoDTO saveCustomer(@Valid CustomerSavePostDTO customer) {
		// TODO Auto-generated method stub
		Customer p=dtoConvertion.getCustomersFromPostCustomerDTO(customer);
		Customer savedObj=repository.save(p);
		CustomerBasicInfoDTO dtoObj=dtoConvertion.getCustomerBasicInfoDTO(savedObj);
		
		return dtoObj;
	}
	/*	String qStr = "SELECT count(user) FROM User1 user1 where user1.userName like :uname and user1.password like :pwd";
				EntityManager entityManager = null;
				long list = 0L;
				try {
				entityManager = JPAUtil.getEntityManager();
				TypedQuery<Long> query = entityManager .createQuery(qStr, Long.class);
				query.setParameter("uname", userName);
				query.setParameter("pwd",passWord);
				list = query.getSingleResult();
				}catch(Exception ex) { }finally {
					if(entityManager != null) entityManager.close();
				}
				if(list==1)
					return 1;
				return list;*/

	@Override
	public boolean validateLogin(String username, String password) {
		// TODO Auto-generated method stub
		return repository.validate(username,password);
		
	}




}
