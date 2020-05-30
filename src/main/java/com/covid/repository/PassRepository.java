package com.covid.repository;

import org.springframework.data.repository.CrudRepository;

import com.covid.model.PassEntity;

public interface PassRepository extends CrudRepository<PassEntity, Long> {

}
