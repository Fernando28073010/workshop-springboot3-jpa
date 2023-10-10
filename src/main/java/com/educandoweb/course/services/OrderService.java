package com.educandoweb.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.course.entities.Order;
import com.educandoweb.course.repositories.OrderRepository;

@Service
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	//Retornar toda a lista do banco de dados
	public List<Order> findAll() {
		return repository.findAll();
	}
	
	//Retorna o Id desejado.
	public Order finById(Long id) {
		Optional<Order>  obj = repository.findById(id);
		return obj.get();
	}

		
}
