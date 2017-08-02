package com.tripple.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tripple.domain.RouteVO;
import com.tripple.mapper.RouteMapper;

@Transactional
@Service
public class RouteServiceImpl implements RouteService{

	@Autowired
	RouteMapper rmapper;
	
	@Override
	public void createRoutes(List<RouteVO> routes) {
		for(RouteVO route : routes){
			rmapper.createRoute(route);
		}
	}

	

}
