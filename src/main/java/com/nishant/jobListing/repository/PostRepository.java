package com.nishant.jobListing.repository;

import java.math.BigInteger;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nishant.jobListing.models.Post;

public interface PostRepository extends MongoRepository<Post, BigInteger> 
{
	
}
