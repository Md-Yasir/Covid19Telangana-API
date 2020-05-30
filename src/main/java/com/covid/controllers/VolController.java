package com.covid.controllers;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.covid.model.VolEntity;
import com.covid.service.VolService;

@CrossOrigin
@RequestMapping("/vol")
@RestController
public class VolController {
	@Autowired 
	VolService volservice;

	@GetMapping("/")
	public String hello() {
		return "hello from Volunteer controller";
	}

	@PostMapping("/addvol")
	public String passForm(@RequestBody VolEntity volentity) {
		
		try {
		volservice.addVol(volentity);
		return "Registered Successfully";
		}
		
		catch(Exception ex) {
			return "Invalid Credentials or Retry";
		}
	}

	@GetMapping("/viewvol")
	public Collection<VolEntity> viewpass(){
		return volservice.viewVol();
	}

}
