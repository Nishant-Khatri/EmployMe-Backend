package com.nishant.jobListing.repository;

import java.util.List;

import com.nishant.jobListing.models.Post;

public interface SearchRepoInterface {
	List<Post> findByText(String text);

}
