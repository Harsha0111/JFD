package com.nseit.blogSpringBoot.service;

import com.nseit.blogSpringBoot.model.Post;
import com.nseit.blogSpringBoot.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {
    @Autowired
    private PostRepository postRepository;

    public Post add(Post post) {
        postRepository.save(post);
        return post;
    }

    public List<Post> findAll() {
        return postRepository.findAll();

    }

    public void update(Post post) {
        postRepository.save(post);
    }

    public void delete(int id) {
       postRepository.deleteById(id);
    }
}

