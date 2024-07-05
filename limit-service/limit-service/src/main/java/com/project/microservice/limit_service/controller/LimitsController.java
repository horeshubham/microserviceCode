package com.project.microservice.limit_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.microservice.limit_service.bean.Limit;
import com.project.microservice.limit_service.configuration.LimitConfiguration;




@RestController
public class LimitsController {
	
	@Autowired
	private LimitConfiguration limitConfiguration;
	
	@GetMapping("/limits")
	public Limit RetriveLimit() {
		return new Limit(limitConfiguration.getMinimum(),limitConfiguration.getMaximum());
//		 return new Limit(1,1000);
	}
	
	

}
