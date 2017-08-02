package com.tripple.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.tripple.domain.RouteVO;
@Transactional
public interface RouteService {
	public void createRoutes(List<RouteVO> routes);
	
}
