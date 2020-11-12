package com.kosarh.springboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kosarh.springboot.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
	
	//Optional<Student> findById(Long id);

}
