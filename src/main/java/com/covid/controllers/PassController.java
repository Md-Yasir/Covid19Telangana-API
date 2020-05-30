package com.covid.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.model.PassEntity;
import com.covid.service.PassService;

@CrossOrigin
@RequestMapping("/pass")
@RestController
public class PassController {
	
	@Autowired 
	PassService passservice;

	@GetMapping("/")
	public String hello() {
		return "hello from pass controller";
	}
	
	@PostMapping("/addpass")
	public String passForm(@RequestBody PassEntity passentity) {
		
		try {
		passservice.addPass(passentity);
		return "Pass Registered Successfully";
		}
		
		catch(Exception ex) {
			
			return "Invalid credentials or retry";
		}
	}
	
	@GetMapping("/viewpass")
	public Collection<PassEntity> viewpass(){
		return passservice.viewpass();
	}
	
	@DeleteMapping("/passissued/{id}")
	public Collection<PassEntity> passIssued(@PathVariable long id){
		passservice.passIssued(id);
		return passservice.viewpass();
	}
}
