package com.temuka.insight_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.temuka.insight_service.entity.MajorStats;

@Repository
public interface MajorStatsRepository extends MongoRepository<MajorStats, String> {

}
