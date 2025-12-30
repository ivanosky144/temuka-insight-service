package com.temuka.insight_service.repository;

import org.springframework.stereotype.Repository;

import com.temuka.insight_service.entity.InsightUser;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

@Repository
public interface InsightUserRepository extends MongoRepository<InsightUser, String>{

    InsightUser findByUsername(String username);

    List<InsightUser> findByCommunitiesJoinedContains(String communityId);

    List<InsightUser> findByInterestsContains(String interest);

    List<InsightUser> findByFollowingContains(String userId);
}
