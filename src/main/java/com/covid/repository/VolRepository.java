package com.covid.repository;

import org.springframework.data.repository.CrudRepository;

import com.covid.model.VolEntity;

public interface VolRepository extends CrudRepository<VolEntity, Long> {

}
