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

import com.covid.model.DocEntity;
import com.covid.service.DocAppointmentService;

@CrossOrigin
@RequestMapping("/doctor")
@RestController
public class DocAppointmentController {
	
	@Autowired 
	DocAppointmentService docservice;

	@GetMapping("/")
	public String hello() {
		return "hello from doctor appointment controller";
	}
	
	@PostMapping("/fixappointment")
	public String fixAppointment(@RequestBody DocEntity docentity) {
		
		try {
		docservice.fixAppointment(docentity);
		return "Appointment Fixed Successfully";
		}
		
		catch(Exception ex) {
			return "Choose different appointment time or date";
		}
	}
	
	@GetMapping("/viewappointments")
	public Collection<DocEntity> viewAppointments(){
		return docservice.viewAppointment();
	}
	
	@DeleteMapping("/appointmentdone/{id}")
	public Collection<DocEntity> appointmentDone(@PathVariable long id){
		docservice.appointmentDone(id);
		return docservice.viewAppointment();
	}
}
