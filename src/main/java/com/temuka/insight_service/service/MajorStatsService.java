package com.temuka.insight_service.service;

import com.temuka.insight_service.entity.MajorStats;
import com.temuka.insight_service.repository.MajorStatsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MajorStatsService {

    private final MajorStatsRepository majorStatsRepository;

    public MajorStats save(MajorStats majorStats) {
        return majorStatsRepository.save(majorStats);
    }
}
