package com.temuka.insight_service.service;

import org.springframework.stereotype.Service;

import com.temuka.insight_service.entity.RecommendationFeedback;
import com.temuka.insight_service.repository.RecommendationFeedbackRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecommendationFeedbackService {

    private final RecommendationFeedbackRepository recommendationFeedbackRepository;

    public RecommendationFeedback save(RecommendationFeedback recommendationFeedback) {
        return recommendationFeedbackRepository.save(recommendationFeedback);
    }

    public List<RecommendationFeedback> getByUser(String userId) {
        return recommendationFeedbackRepository.findByUserId(userId);
    }

    public List<RecommendationFeedback> getByTarget(String targetId) {
        return recommendationFeedbackRepository.findByTargetId(targetId);
    }

    public List<RecommendationFeedback> getByAction(String action) {
        return recommendationFeedbackRepository.findByAction(action);
    }
}
