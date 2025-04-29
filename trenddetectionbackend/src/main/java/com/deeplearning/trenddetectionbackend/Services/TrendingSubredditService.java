package com.deeplearning.trenddetectionbackend.Services;

import com.deeplearning.trenddetectionbackend.Entities.TrendingSubreddit;
import com.deeplearning.trenddetectionbackend.Repository.TrendingSubredditRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrendingSubredditService {
    private final TrendingSubredditRepo trendingSubredditRepo;
    public TrendingSubredditService(TrendingSubredditRepo trendingSubredditRepo) {
        this.trendingSubredditRepo = trendingSubredditRepo;
    }




    public List<TrendingSubreddit> getTrendingSubreddits() {
        return trendingSubredditRepo.findAll();
    }

}
