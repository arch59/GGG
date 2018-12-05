package com.cg.tds.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import com.cg.tds.model.Client;

@Repository
public class TDSDaoImpl implements TDSDao {
	@Autowired
	private MongoTemplate mongoTemplate;

	/*
	 * Method Name:getUserById
	 * Return Type:Client
	 * Author:Capgemini
	 * creation date:12-03-2018
	 * 
	 */


	@Override
	public Client getUserById(String uniqueId) {
		Query query = new Query();
		query.addCriteria(Criteria.where("_id").is(uniqueId));
		Client client = mongoTemplate.findOne(query, Client.class);
		return client;
	}

}
