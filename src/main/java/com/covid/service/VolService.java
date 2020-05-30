package com.covid.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.covid.model.VolEntity;
import com.covid.repository.VolRepository;

@Service
public class VolService {
	
	@Autowired
	VolRepository volrepo;
	
public void addVol(VolEntity volentity) {
		
		volrepo.save(volentity);
	}

	public Collection<VolEntity> viewVol() {
		List<VolEntity> passes = new ArrayList<>();
		for(VolEntity pass : volrepo.findAll()) {
			passes.add(pass);
	}
		return passes;
	
	}

}
