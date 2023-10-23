package com.nishant.jobListing.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nishant.jobListing.models.Post;
import com.nishant.jobListing.repository.PostRepository;
import com.nishant.jobListing.repository.SearchRepository;


@RestController 
@CrossOrigin(origins="http://localhost:3000")
public class PostController{
	
	@Autowired
	PostRepository repo;
	@Autowired
	SearchRepository srepo;
	@PostMapping("/post")

	public Post addPost(@RequestBody Post post) 
	{
		return repo.save(post);
		
	}
	@GetMapping("/posts/{text}")

	public List<Post> search(@PathVariable String text)
	{
		return srepo.findByText(text);
	}
	@GetMapping("/allPosts")

	public List<Post> getAllPosts()
	{
		return repo.findAll();
	}

}
