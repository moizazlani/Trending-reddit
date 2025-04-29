package com.deeplearning.trenddetectionbackend.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "comments")
public class Comment {

    @Id
    @Column(name = "comment_id", nullable = false)
    private String commentId;

    @Column(name = "post_id")
    private String postId;

    @Column(name = "comment_author")
    private String commentAuthor;

    @Column(name = "comment_text")
    private String commentText;

    @Column(name = "comment_score")
    private Integer commentScore;

    @Column(name = "posted_at")
    private LocalDateTime postedAt;

    @Column(name = "sentiment")
    private Integer sentiment;

    @Column(name = "createdat")
    private LocalDateTime createdAt;
}
