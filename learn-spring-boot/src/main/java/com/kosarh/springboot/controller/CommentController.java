package com.kosarh.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kosarh.springboot.jpa.CommentRepository;
import com.kosarh.springboot.jpa.PostRepository;
import com.kosarh.springboot.model.Comment;
import com.kosarh.springboot.model.Post;

@RestController
@RequestMapping("/api/v1")
public class CommentController {
	@Autowired
	private CommentRepository commentRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@RequestMapping("/posts/{postId}/comments")
	public Page<Comment> getComments(@PathVariable(value = "postId") Long postId, Pageable pageable) {
		return commentRepository.findByPostId(postId, pageable);
		
	}
	
	@PostMapping("/posts/{postId}/comments")
	public void createComments(@PathVariable(value = "postId") Long postId, @RequestBody Comment comment) {
		Optional<Post> post = postRepository.findById(postId);
		comment.setPost(post.get());
		commentRepository.save(comment);
	}
	
	@DeleteMapping("/posts/{postId}/comments/{commentId}")
	public void deleteComments(@PathVariable(value = "postId") Long postId, @PathVariable(value = "commentId") Long id) {
		Optional<Comment> comment = commentRepository.findByIdAndPostId(id, postId);
		commentRepository.delete(comment.get());
	}

}
