package com.covid.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

@RestController
<<<<<<< HEAD
@CrossOrigin("https://covid19telangana.herokuapp.com")
//@CrossOrigin
=======
@CrossOrigin

>>>>>>> e7b7898c0c1f25d16984783adf47ed28a222fa98
public class UserController {

	@Autowired
	ObjectMapper mapper;


	@GetMapping("/")
	public String welcome() {
		return "welcome";
	}

	@GetMapping("/admin")
	public ObjectNode admin() {
		ObjectNode objectNode = mapper.createObjectNode();
		objectNode.put("message", "authorised");
		return objectNode;
	}


}
