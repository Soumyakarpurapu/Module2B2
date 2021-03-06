package com.cg.schedulemanagementsystem.service;

import java.util.List;

import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.schedulemanagementsystem.dao.ITrainingDAO;
import com.cg.schedulemanagementsystem.dto.Client;


@Service("trainingservice")
@Transactional
public class TrainingServiceImpl implements ITrainingService {
	
	@Autowired
	ITrainingDAO trainingdao;

	@Override
	public List<Client> getAllDetail() {
		// TODO Auto-generated method stub
		return trainingdao.getAllDetail();
	}

}
