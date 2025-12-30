package com.temuka.insight_service.service;

import com.temuka.insight_service.entity.AnalyticsEvent;
import com.temuka.insight_service.repository.AnalyticsEventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.time.Instant;

@Service
@RequiredArgsConstructor
public class AnalyticsEventService {

    private final AnalyticsEventRepository analyticsEventRepository;

    public AnalyticsEvent save(AnalyticsEvent analyticEvent) {
        return analyticsEventRepository.save(analyticEvent);
    }

    public List<AnalyticsEvent> getByUser(String userId) {
        return analyticsEventRepository.findByUserId(userId);
    }

    public List<AnalyticsEvent> getByEventName(String eventName) {
        return analyticsEventRepository.findByEventName(eventName);
    }

    public List<AnalyticsEvent> getBetween(Instant start, Instant end) {
        return analyticsEventRepository.findByTimeStampBetween(start, end);
    }
}
