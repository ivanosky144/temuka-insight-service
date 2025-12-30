package com.temuka.insight_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.temuka.insight_service.entity.UserProfileVector;

@Repository
public interface UserProfileVectorRepository extends MongoRepository<UserProfileVector, String> {

    UserProfileVector findByUserId(String userId);
}
