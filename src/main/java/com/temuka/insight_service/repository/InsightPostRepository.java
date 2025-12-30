package com.temuka.insight_service.repository;

import org.springframework.stereotype.Repository;

import com.temuka.insight_service.entity.InsightPost;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.time.Instant;

@Repository
public interface InsightPostRepository extends MongoRepository<InsightPost, String> {

    List<InsightPost> findByUserId(String userId);

    List<InsightPost> findByCommunityId(String communityId);

    List<InsightPost> findByCreatedAtBetween(Instant start, Instant end);

    List<InsightPost> findByTagsContaining(String tag);
}
