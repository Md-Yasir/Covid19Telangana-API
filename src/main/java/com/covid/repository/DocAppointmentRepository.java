package com.covid.repository;

<<<<<<< HEAD
import org.springframework.data.repository.CrudRepository;
=======
import java.util.Date;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
>>>>>>> e7b7898c0c1f25d16984783adf47ed28a222fa98

import com.covid.model.DocEntity;

public interface DocAppointmentRepository extends CrudRepository<DocEntity, Long> {
	
}
