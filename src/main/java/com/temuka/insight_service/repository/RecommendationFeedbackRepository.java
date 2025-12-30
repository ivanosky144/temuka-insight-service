package com.temuka.insight_service.repository;

import org.springframework.stereotype.Repository;

import com.temuka.insight_service.entity.RecommendationFeedback;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Repository
public interface RecommendationFeedbackRepository extends MongoRepository<RecommendationFeedback, String> {

    List<RecommendationFeedback> findByUserId(String userId);

    List<RecommendationFeedback> findByTargetId(String targetId);

    List<RecommendationFeedback> findByAction(String action);
}
