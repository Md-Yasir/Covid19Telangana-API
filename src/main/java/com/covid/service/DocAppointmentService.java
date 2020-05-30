package com.covid.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.model.DocEntity;
import com.covid.repository.DocAppointmentRepository;

@Service 
public class DocAppointmentService {
	
	@Autowired 
	DocAppointmentRepository docrepo;

	public String fixAppointment(DocEntity docentity) {
		
		docrepo.save(docentity);
			return "Appointment Fixed Successfully";
		}
		
	public Collection<DocEntity> viewAppointment() {
		List<DocEntity> appointments = new ArrayList<>();
		for(DocEntity appointment : docrepo.findAll()) {
			appointments.add(appointment);
	}
		return appointments;
	
	}

	public void appointmentDone(long id) {

		docrepo.deleteById(id);
		
	}
}
