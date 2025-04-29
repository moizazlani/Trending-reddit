package com.deeplearning.trenddetectionbackend.Services;

import com.deeplearning.trenddetectionbackend.Entities.Comment;
import com.deeplearning.trenddetectionbackend.Repository.CommentRepo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommentService {

    private CommentRepo commentRepo;
    public CommentService(CommentRepo commentRepo) {
        this.commentRepo = commentRepo;
    }



    public Page<Comment> getCommentsByPostId(String postId, Pageable pageable) {
        return commentRepo.findByPostId(postId, pageable);
    }

    public Optional<Comment> getCommentById(String commentId) {
        return commentRepo.findById(commentId);
    }
}
