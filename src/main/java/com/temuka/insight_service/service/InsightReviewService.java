package com.temuka.insight_service.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import com.temuka.insight_service.entity.InsightReview;
import com.temuka.insight_service.repository.InsightReviewRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InsightReviewService {

    private final InsightReviewRepository insightReviewRepository;

    public InsightReview save(InsightReview insightReview) {
        return insightReviewRepository.save(insightReview);
    }

    public List<InsightReview> getByUser(String userId) {
        return insightReviewRepository.findByUserId(userId);
    }

    public List<InsightReview> getByUniversity(String universityId) {
        return insightReviewRepository.findByUniversityId(universityId);
    }

    public List<InsightReview> getByMajor(String majorId) {
        return insightReviewRepository.findByMajorId(majorId);
    }

    public List<InsightReview> getByMinimumRating(double rating) {
        return insightReviewRepository.findByRatingGreaterThanEqual(rating);
    }
}
