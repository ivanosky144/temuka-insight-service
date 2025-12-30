package com.temuka.insight_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.temuka.insight_service.entity.SearchIndex;

@Repository
public interface SearchIndexRepository extends MongoRepository<SearchIndex, String> {

    @Override
    void deleteById(String id);
}
