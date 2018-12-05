package com.cg.tds.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.tds.dao.TDSDao;
import com.cg.tds.model.Client;

@Service
public class TDSServiceImpl implements TDSService {
	@Autowired
private TDSDao dao;
	/*
	 * Method Name:getUserById
	 * Return Type:Client
	 * Author:Capgemini
	 * creation date:12-03-2018
	 * 
	 */

	@Override
	public Client getUserById(String uniqueId) {
		return dao.getUserById(uniqueId);
	}

}
