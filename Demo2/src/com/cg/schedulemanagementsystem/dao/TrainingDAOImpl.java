package com.cg.schedulemanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cg.schedulemanagementsystem.dto.Client;


@Repository("trainingdao")
public class TrainingDAOImpl implements ITrainingDAO {
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public List<Client> getAllDetail() {
		// TODO Auto-generated method stub
		Query queryGet=em.createQuery("FROM Client");
		List<Client> myAll=queryGet.getResultList();
		return myAll;
	}
	

}
