package com.covid.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.model.PassEntity;
import com.covid.repository.PassRepository;

@Service 
public class PassService {
	
	@Autowired 
	PassRepository passrepository;

	public void addPass(PassEntity passentity) {
		
		passrepository.save(passentity);
	}

	public Collection<PassEntity> viewpass() {
		List<PassEntity> passes = new ArrayList<>();
		for(PassEntity pass : passrepository.findAll()) {
			passes.add(pass);
	}
		return passes;
	
	}

	public void passIssued(long id) {

		passrepository.deleteById(id);
	}
}
