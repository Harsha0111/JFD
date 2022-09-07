package com.codewithashith.Delete_blog.service;

import com.codewithashith.Delete_blog.exception.ResourceNotFoundException;
import com.codewithashith.Delete_blog.model.Post;
import com.codewithashith.Delete_blog.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts() {
        return postRepository.findAll();
    }

    public Post createPost(Post post) {
        return postRepository.save(post);
    }

    public Post updatePost(Post post) {
        if (post.getId() == null)
            throw new ResourceNotFoundException("Id must not be null");

        boolean isExist = postRepository.findById(post.getId()).isPresent();
        if (!isExist)
            throw new ResourceNotFoundException("Invalid Post");
        return postRepository.save(post);
    }

    public void deletePost(Integer postId) {
        postRepository.deleteById(postId);
    }
}
