package com.covid.repository;

import org.springframework.data.repository.CrudRepository;

import com.covid.model.DocEntity;

public interface DocAppointmentRepository extends CrudRepository<DocEntity, Long> {
	
}
