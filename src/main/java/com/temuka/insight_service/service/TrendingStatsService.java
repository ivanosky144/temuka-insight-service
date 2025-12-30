package com.temuka.insight_service.service;

import org.springframework.stereotype.Service;

import com.temuka.insight_service.entity.TrendingStats;
import com.temuka.insight_service.repository.TrendingStatsRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TrendingStatsService {

    private final TrendingStatsRepository trendingStatsRepository;

    public TrendingStats save(TrendingStats trendingStats) {
        return trendingStatsRepository.save(trendingStats);
    }

    public TrendingStats getByCategory(String category) {
        return trendingStatsRepository.findByCategory(category);
    }
}
