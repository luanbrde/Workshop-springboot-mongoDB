package com.avansiluan.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.avansiluan.workshopmongo.domain.User;
import com.avansiluan.workshopmongo.exception.ObjectNotFoundException;
import com.avansiluan.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	public UserRepository userRepository;

	public List<User> findAll() {
		return userRepository.findAll();

	}

	public User FindById(String id) {
		Optional<User> obj = userRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		
		
	}
}
