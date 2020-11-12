package com.kosarh.springboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kosarh.springboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
