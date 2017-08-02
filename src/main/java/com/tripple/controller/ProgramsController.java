package com.tripple.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tripple.domain.ProgramVO;
import com.tripple.mapper.ProgramMapper;
import com.tripple.mapper.UserMapper;
import com.tripple.service.ProgramService;
@CrossOrigin(origins = "*")
@RestController
public class ProgramsController {

	
	private	final String df = "/v0.1/guide";
	
	@Autowired
	private ProgramService service;
	
	@GetMapping(df+"/programs")
	public ResponseEntity<List<ProgramVO>> readProgramsAll(){
		
		return new ResponseEntity<List<ProgramVO>>(service.listAll(),HttpStatus.OK);
	}
	
	@PostMapping(df+"/programs") 
	public ResponseEntity<String> createProgram(@RequestBody ProgramVO program){
		service.createProgram(program);
		return new ResponseEntity<String>("SUCCESS",HttpStatus.OK);
	}
	
	@GetMapping(df+"/programs/detail/{program_id}")
	public ResponseEntity<Map> readProgramsById(@PathVariable(value = "program_id") int program_id){
		System.out.println("/readProgramById started");
		Map res = service.listById(program_id);
		return new ResponseEntity<Map>(res,HttpStatus.OK);
	}
	
	@GetMapping(df+"programs/user/{user_id}")
	public ResponseEntity<List<ProgramVO>> readPrograsByUid(@PathVariable(value = "user_id") int user_id){
		return new ResponseEntity<List<ProgramVO>>(service.readProgramsByUid(user_id),HttpStatus.OK);
	}
	
	//조회 및 페이지네이션 필요
}
