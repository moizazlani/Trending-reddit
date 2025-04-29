package com.deeplearning.trenddetectionbackend.Services;


import com.deeplearning.trenddetectionbackend.Entities.Post;
import com.deeplearning.trenddetectionbackend.Repository.PostRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class PostService {

    private PostRepo postRepo;
    public PostService(PostRepo postRepo) {
        this.postRepo = postRepo;
    }


    //get all posts
    public Page<Post> getAllPosts(Pageable pageable) {
        return postRepo.findAll(pageable);
    }

    //get post by id
    public Optional<Post> getPostById(String id){
        return postRepo.findById(id);
    }


}
