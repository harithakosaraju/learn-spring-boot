package com.kosarh.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.kosarh.springboot.jpa.StudentRepository;
import com.kosarh.springboot.model.Student;

@Component
public class StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	/*public Student getStudent() {
		studentRepository.findById(id)
	}*/
	
	public void save() {
		Student student = new Student("Haritha", 40);
		studentRepository.save(student);
	}

}
