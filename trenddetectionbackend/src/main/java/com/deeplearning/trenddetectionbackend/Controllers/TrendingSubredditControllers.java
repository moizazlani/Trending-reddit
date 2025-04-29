package com.deeplearning.trenddetectionbackend.Controllers;

import com.deeplearning.trenddetectionbackend.Entities.TrendingSubreddit;
import com.deeplearning.trenddetectionbackend.Services.TrendingSubredditService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/subreddit")
public class TrendingSubredditControllers {

    private final TrendingSubredditService trendingSubredditService;
    public TrendingSubredditControllers(TrendingSubredditService trendingSubredditService) {
        this.trendingSubredditService = trendingSubredditService;
    }

    @GetMapping
    public List<TrendingSubreddit> getAllSubreddits(){
        return trendingSubredditService.getTrendingSubreddits();
    }
}
