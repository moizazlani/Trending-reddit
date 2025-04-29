package com.deeplearning.trenddetectionbackend.Repository;

import com.deeplearning.trenddetectionbackend.Entities.TrendingPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrendingPostRepo extends JpaRepository<TrendingPost, String> {
}
