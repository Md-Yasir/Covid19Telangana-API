package com.covid.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.covid.model.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Integer>{

	Optional<UserEntity> findByUsername(String username);

}
