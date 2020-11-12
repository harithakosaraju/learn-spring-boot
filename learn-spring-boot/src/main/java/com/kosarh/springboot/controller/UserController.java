package com.kosarh.springboot.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kosarh.springboot.exception.ResourceNotFoundException;
import com.kosarh.springboot.jpa.UserRepository;
import com.kosarh.springboot.model.User;

@RestController
@RequestMapping("/api/v1")
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}
	
	@GetMapping("/users/{id}")
	public ResponseEntity<User> getUserById(@PathVariable Long id) throws ResourceNotFoundException {
		User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not Found "+id)) ;
		return ResponseEntity.ok().body(user);
	}
	
	@PostMapping("/users")
	public void createUser(@RequestBody User user) {
		userRepository.save(user);
	}

	@PutMapping("/users/{id}")
	public ResponseEntity<User> updateUser(@PathVariable Long id,
											@RequestBody User user) throws ResourceNotFoundException {
		User existingUser = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not Found "+ id));
		existingUser.setFirstName(user.getFirstName());
		existingUser.setLastName(user.getLastName());
		existingUser.setEmail(user.getEmail());
		existingUser.setLastModifiedDate(new Date());
		final User updatedUser = userRepository.save(existingUser);
		return ResponseEntity.ok(updatedUser);
	}
	
	@DeleteMapping("/users/{id}")
	public Map<String,Boolean> deleteUser(@PathVariable Long id) throws ResourceNotFoundException {
		User user = userRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("User not Found "+ id));
		userRepository.delete(user);
		Map<String, Boolean> response = new HashMap<String, Boolean>();
		response.put("Deleted", Boolean.TRUE);
		return response;
	}
}
