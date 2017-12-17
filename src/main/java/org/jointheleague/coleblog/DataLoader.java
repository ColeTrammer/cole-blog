package org.jointheleague.coleblog;

import java.util.Date;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataLoader {

	private PostRepository postRepo;

	@Autowired
	public DataLoader(PostRepository postRepo) {
		this.postRepo = postRepo;
	}

	@PostConstruct
	private void loadData() {
		postRepo.save(new Post("Post1", "Stuff ...", new Date()));
		postRepo.save(new Post("Post2", "Stuff ...", new Date()));
		postRepo.save(new Post("Post3", "Stuff ...", new Date()));
	}

	public Iterable<Post> findAll() {
		return postRepo.findAll();
	}
}
