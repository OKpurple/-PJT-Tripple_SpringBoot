package com.tripple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tripple.domain.RouteVO;
import com.tripple.service.RouteService;
@CrossOrigin(origins = "*")
@RestController
public class RoutesController {
	private	final String df = "/v0.1/guide";
	
	@Autowired
	private RouteService service;
	
	@PostMapping(df + "/routes")
	public ResponseEntity<String> createRoutes(@RequestBody List<RouteVO> routes){
		service.createRoutes(routes);
		return new ResponseEntity<String>("Success",HttpStatus.OK);
	}
}
