package com.deeplearning.trenddetectionbackend.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "posts") // Replace with actual table name
public class Post {

    @Id
    @Column(name = "post_id", nullable = false)
    private String postId;

    @Column(name = "title")
    private String title;

    @Column(name = "author")
    private String author;

    @Column(name = "text")
    private String text;

    @Column(name = "domain")
    private String domain;

    @Column(name = "subreddit")
    private String subreddit;

    @Column(name = "upvotes")
    private Integer upvotes;

    @Column(name = "downvotes")
    private Integer downvotes;

    @Column(name = "score")
    private Integer score;

    @Column(name = "comments_count")
    private Integer commentsCount;

    @Column(name = "flair")
    private String flair;

    @Column(name = "nsfw")
    private Boolean nsfw;

    @Column(name = "spoiler")
    private Boolean spoiler;

    @Column(name = "is_video")
    private Boolean isVideo;

    @Column(name = "posted_at")
    private LocalDateTime postedAt;

    @Column(name = "url")
    private String url;

    @Column(name = "permalink")
    private String permalink;

    @Column(name = "sentiment")
    private Integer sentiment;

    @Column(name = "createdat")
    private LocalDateTime createdAt;

    // Getters and setters (or use Lombok for cleaner code)
}
