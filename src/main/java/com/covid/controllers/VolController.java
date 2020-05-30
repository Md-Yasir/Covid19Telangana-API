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
<<<<<<< HEAD
<<<<<<< HEAD
=======
>>>>>>> d72ccfedf7fb15617896fd79dc4283756af45bec
		
		try {
		volservice.addVol(volentity);
		return "Registered Successfully";
		}
		
		catch(Exception ex) {
			return "Invalid Credentials or Retry";
		}
<<<<<<< HEAD
=======
		volservice.addVol(volentity);
		return "Registered Successfully";
>>>>>>> e7b7898c0c1f25d16984783adf47ed28a222fa98
=======
>>>>>>> d72ccfedf7fb15617896fd79dc4283756af45bec
	}

	@GetMapping("/viewvol")
	public Collection<VolEntity> viewpass(){
		return volservice.viewVol();
	}

}
