package com.kosarh.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kosarh.springboot.jpa.StudentRepository;
import com.kosarh.springboot.model.Student;

@RestController
@RequestMapping("/students")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@GetMapping("/findAll")
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

}
