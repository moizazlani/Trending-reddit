package com.deeplearning.trenddetectionbackend.Repository;

import com.deeplearning.trenddetectionbackend.Entities.Comment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CommentRepo extends CrudRepository<Comment, String> {


    Page<Comment> findByPostId(String postId, Pageable pageable);
}
