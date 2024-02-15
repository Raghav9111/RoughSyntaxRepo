package com.syntaxSavants.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.syntaxSavants.entities.User;
import com.syntaxSavants.models.PatientModel;
import com.syntaxSavants.repositories.UserRepository;



@Service
public class UserService implements UserDetailsService
{
	@Autowired
	private UserRepository userRepo;
	
	public User getById(int id) 
	{
		return userRepo.findById(id).get();
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException 
	{
		UserDetails user = userRepo.findByEmail(username).get();
		return user;
	}

}
