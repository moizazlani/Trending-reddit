package com.deeplearning.trenddetectionbackend.Repository;

import com.deeplearning.trenddetectionbackend.Entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepo extends JpaRepository<Post, String> {
    //Custom functions
}
