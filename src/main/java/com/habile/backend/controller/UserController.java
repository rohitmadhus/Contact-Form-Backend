package com.habile.backend.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.habile.backend.exception.ResourceNotFoundEception;
import com.habile.backend.model.User;
import com.habile.backend.repository.UserRepository;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	@PostMapping("/users")
	public User addUser(@RequestBody User user) {
		return userRepository.save(user);
		
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Map<String,Boolean>> deleteUser(@PathVariable String id){	
	User user = userRepository.findById(id).orElseThrow(()-> new ResourceNotFoundEception("User does not exist"));
		userRepository.delete(user);
		Map<String,Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return ResponseEntity.ok(response);
	}

}
