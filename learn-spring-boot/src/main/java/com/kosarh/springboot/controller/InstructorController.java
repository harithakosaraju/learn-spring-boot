package com.kosarh.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kosarh.springboot.jpa.InstructorRepository;
import com.kosarh.springboot.model.Instructor;

@RestController
@RequestMapping("/api/v1")
public class InstructorController {
	@Autowired
	private InstructorRepository instructorRepository;
	
	@GetMapping("/instructors")
	public List<Instructor> getInstructors() {
		return instructorRepository.findAll();
	}
	
	@PostMapping("/instructors")
	public void save(@RequestBody Instructor instructor) {
		instructorRepository.save(instructor);
	}

}
