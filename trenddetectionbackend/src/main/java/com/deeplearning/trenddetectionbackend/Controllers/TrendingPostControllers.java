package com.deeplearning.trenddetectionbackend.Controllers;


import com.deeplearning.trenddetectionbackend.Entities.TrendingPost;
import com.deeplearning.trenddetectionbackend.Services.TrendingPostService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/posts/trending")
public class TrendingPostControllers {

    private final TrendingPostService trendingPostService;

    public TrendingPostControllers(TrendingPostService trendingPostService) {
        this.trendingPostService = trendingPostService;
    }

    //get all trending posts
    @GetMapping
    public List<TrendingPost> getTrendingPosts(){
        return trendingPostService.getAllTrendingPosts();
    }


}
