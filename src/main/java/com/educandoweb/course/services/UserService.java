package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.User;
import com.educandoweb.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	//Retornar toda a lista do banco de dados
	public List<User> findAll() {
		return repository.findAll();
	}
	
	//Retorna o Id desejado.
	public User finById(Long id) {
		Optional<User>  obj = repository.findById(id);
		return obj.get();
	}

		
}
