package com.tripple.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tripple.domain.UserVO;
import com.tripple.mapper.UserMapper;
@CrossOrigin(origins = "*")
@RestController
//@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UserMapper mapper;
	private final String userUrl =""; 
	
	@GetMapping("/users")
	public List<UserVO> getUser() throws Exception{
		return (List<UserVO>) mapper.selectAll();
	}
	
}
