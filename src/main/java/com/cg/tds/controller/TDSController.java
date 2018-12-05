package com.cg.tds.controller;

import java.util.List;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.tds.exceptions.UserNotFoundException;
import com.cg.tds.model.Client;
import com.cg.tds.service.TDSService;

@RestController
@RequestMapping("/user/tds")
public class TDSController {
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	@Autowired
	private TDSService service;
/*
 * Method Name:getUserById
 * Return Type:Client
 * Author:Capgemini
 * creation date:12-03-2018
 * 
 */

	@RequestMapping(value = "/{uniqueId}", method = RequestMethod.GET)
	public Client getUserById(@PathVariable String uniqueId) {
		LOG.info("Details fetched succesfully for ID:{}", uniqueId);
		Client client = service.getUserById(uniqueId);
		if (client == null) {
			throw new UserNotFoundException("ID not found wrong id:" + uniqueId);
		}
		System.out.println("Details fetched successfully");
        System.out.println(client.toString());
		return client;
	}
}
