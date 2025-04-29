package com.deeplearning.trenddetectionbackend.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "trending_subreddits")
public class TrendingSubreddit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // or GenerationType.AUTO
    @Column(name = "subreddit_id")
    private Long subredditId;

    @Column(name = "subreddit", nullable = false)
    private String subreddit;

    @Column(name = "upvotes")
    private Integer upvotes;

    @Column(name = "downvotes")
    private Integer downvotes;

    @Column(name = "score")
    private Integer score;

    @Column(name = "comment_count")
    private Integer commentCount;

    @Column(name = "post_volume")
    private Integer postVolume;

    @Column(name = "sentiment")
    private Double sentiment;

    @Column(name = "engagement")
    private Double engagement;

    @Column(name = "detected_at")
    private LocalDateTime detectedAt;
}
