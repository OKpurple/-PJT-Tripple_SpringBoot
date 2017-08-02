package com.tripple.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tripple.domain.ProgramVO;
import com.tripple.mapper.ProgramMapper;
import com.tripple.mapper.RouteMapper;

@Service
public class ProgramServiceImpl implements ProgramService{

	@Autowired
	private ProgramMapper pmapper;
	@Autowired
	private RouteMapper rmapper;
	
	@Override
	public void createProgram(ProgramVO program) {
		pmapper.createProgram(program);
	}

	@Override
	public List<ProgramVO> listAll() {		
		return pmapper.listAll();
	}

	@Override
	public Map<String, Object> listById(int program_id) {
//		Map<String,Object> res = new HashMap<String,Object>();
//		res.put("programs", pmapper.programById(program_id));
//		res.put("routes", rmapper.listRouteById(program_id));
//		return res;
		
		ObjectMapper mapper = new ObjectMapper();
		
		// Convert POJO to Map
		Map<String, Object> map = mapper.convertValue(pmapper.programById(program_id), new TypeReference<Map<String, Object>>() {});
		map.put("routes", rmapper.listRouteById(program_id));
		return map;
	}

	@Override
	public List<ProgramVO> readProgramsByUid(int user_id) {
		return pmapper.readProgramsByUid(user_id);
	}
	

	
	

}
