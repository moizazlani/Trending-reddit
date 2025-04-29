package com.deeplearning.trenddetectionbackend.Controllers;


import com.deeplearning.trenddetectionbackend.Entities.Comment;
import com.deeplearning.trenddetectionbackend.Services.CommentService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user/comments")
public class CommentControllers {

    //get comment by post id

    private final CommentService commentService;

    public CommentControllers(CommentService commentService) {
        this.commentService = commentService;
    }

    @GetMapping("/post/{postId}")
    public Page<Comment> getCommentsByPostId(
            @PathVariable String postId,
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size,
            @RequestParam(defaultValue = "desc") String sortDir
    ){
        Sort sort = sortDir.equalsIgnoreCase("asc")?
                Sort.by("postedAt").ascending():
                Sort.by("postedAt").descending();

        Pageable pageable = PageRequest.of(page, size, sort);

        return commentService.getCommentsByPostId(postId, pageable);
    }

    @GetMapping("/{commentId}")
    public ResponseEntity<Comment> getCommentById(
            @PathVariable String commentId
    ){
        return commentService.getCommentById(commentId)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
