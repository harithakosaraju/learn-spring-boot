package com.kosarh.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kosarh.springboot.jpa.PostRepository;
import com.kosarh.springboot.model.Post;

@RestController
@RequestMapping("/api/v1")
public class PostController {
	
	@Autowired
	private PostRepository postRepository;
	
	@RequestMapping("/posts")
	public List<Post> getPosts() {
		return postRepository.findAll();
	}
	
	@PostMapping("/posts")
	public void savePosts(@RequestBody Post post) {
		postRepository.save(post);
	}
	
	@DeleteMapping("/posts/{postId}")
	public void deletePosts(@PathVariable(value="postId") Long postId) {
		Optional<Post> post = postRepository.findById(postId);
		postRepository.delete(post.get());
	}
}
