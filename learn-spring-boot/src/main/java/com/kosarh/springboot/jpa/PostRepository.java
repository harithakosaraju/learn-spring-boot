package com.kosarh.springboot.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kosarh.springboot.model.Post;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

}
