package com.in28minutes.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.rest.dao.UserDAOService;
import com.in28minutes.rest.entity.User;
import com.in28minutes.rest.proxy.ServiceTwoFeignClient;

@RestController
@RequestMapping(value ="/throttling")
public class UserController {

	@Autowired
	private UserDAOService service;
	
	//@Autowired
	private ServiceTwoFeignClient serviceTwoFeignClient;
	
	
	@GetMapping("/users")
	public ResponseEntity<Object> getUsers() {
			List<User> usersList = service.getUsers();
			return new ResponseEntity(usersList, HttpStatus.OK);
	}
	
	@GetMapping("/users1")
	public ResponseEntity<Object> getUsers1() {
			List<User> usersList = service.getUsers();
			return new ResponseEntity(usersList, HttpStatus.OK);
	}
	
	@GetMapping("/message-using-feign")
	public ResponseEntity<Object> getUsersUsingFeign() {
			String message = serviceTwoFeignClient.getMessage();
			return new ResponseEntity(message, HttpStatus.OK);
	}

}
