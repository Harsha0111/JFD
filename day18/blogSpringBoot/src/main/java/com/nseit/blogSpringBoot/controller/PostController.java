package com.nseit.blogSpringBoot.controller;

import com.nseit.blogSpringBoot.model.Post;
import com.nseit.blogSpringBoot.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/post")
@RestController
public class PostController {
    @Autowired
    private PostService postService;

    @PostMapping
    public void add(@RequestBody Post post){
        postService.add(post);
    }

    @GetMapping
    List<Post> get(){
        return postService.findAll();
    }

    @PutMapping
    void update(@RequestBody Post post){
        postService.update(post);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        postService.delete(id);
    }
    }

