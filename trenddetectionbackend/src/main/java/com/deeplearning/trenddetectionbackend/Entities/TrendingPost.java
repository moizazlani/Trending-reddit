package com.deeplearning.trenddetectionbackend.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "trending_posts")
public class TrendingPost {

    @Id
    @Column(name = "post_id", nullable = false)
    private String postId;

    @Column(name = "title")
    private String title;

    @Column(name = "subreddit")
    private String subreddit;

    @Column(name = "upvotes")
    private Integer upvotes;

    @Column(name = "downvotes")
    private Integer downvotes;

    @Column(name = "score")
    private Integer score;

    @Column(name = "comment_count")
    private Integer commentCount;

    @Column(name = "sentiment")
    private Double sentiment;

    @Column(name = "engagement_ratio")
    private Double engagementRatio;

    @Column(name = "total_comment_score")
    private Integer totalCommentScore;

    @Column(name = "detected_at")
    private LocalDateTime detectedAt;
}
