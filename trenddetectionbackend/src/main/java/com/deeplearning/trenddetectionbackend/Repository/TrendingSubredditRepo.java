package com.deeplearning.trenddetectionbackend.Repository;

import com.deeplearning.trenddetectionbackend.Entities.TrendingSubreddit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrendingSubredditRepo extends JpaRepository<TrendingSubreddit, Long> {
}
