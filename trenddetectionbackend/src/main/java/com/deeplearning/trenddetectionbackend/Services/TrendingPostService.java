package com.deeplearning.trenddetectionbackend.Services;

import com.deeplearning.trenddetectionbackend.Entities.TrendingPost;
import com.deeplearning.trenddetectionbackend.Repository.TrendingPostRepo;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrendingPostService {

    private final TrendingPostRepo trendingPostRepo;
    public TrendingPostService(TrendingPostRepo trendingPostRepo) {
        this.trendingPostRepo = trendingPostRepo;
    }


    //get all trending posts

    public List<TrendingPost> getAllTrendingPosts() {
        return trendingPostRepo.findAll();
    }




}
