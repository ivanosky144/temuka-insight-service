package com.temuka.insight_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.temuka.insight_service.entity.InsightReview;

import java.util.List;

@Repository
public interface InsightReviewRepository extends MongoRepository<InsightReview, String> {

    List<InsightReview> findByUserId(String userId);

    List<InsightReview> findByUniversityId(String universityId);

    List<InsightReview> findByMajorId(String majorId);

    List<InsightReview> findByRatingGreaterThanEqual(double rating);
}
