package com.covid.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.covid.model.MyUserDetails;
import com.covid.model.UserEntity;
import com.covid.repository.UserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	UserRepository userepo;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		Optional<UserEntity> userentity = userepo.findByUsername(username);
		
		userentity.orElseThrow(() -> new UsernameNotFoundException("User Not Found"));
		
		return userentity.map(MyUserDetails::new).get();
	}     

}
