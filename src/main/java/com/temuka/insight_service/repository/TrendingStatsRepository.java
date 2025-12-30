package com.temuka.insight_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.temuka.insight_service.entity.TrendingStats;

@Repository
public interface TrendingStatsRepository extends MongoRepository<TrendingStats, String> {

    TrendingStats findByCategory(String category);
}
