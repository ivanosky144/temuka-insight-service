package com.temuka.insight_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.temuka.insight_service.entity.AnalyticsEvent;

import java.time.Instant;
import java.util.List;

@Repository
public interface AnalyticsEventRepository extends MongoRepository<AnalyticsEvent, String>{

    List<AnalyticsEvent> findByUserId(String userId);

    List<AnalyticsEvent> findByEventName(String eventName);

    List<AnalyticsEvent> findByTimeStampBetween(Instant start, Instant end);
}
