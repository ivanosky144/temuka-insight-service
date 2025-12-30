package com.temuka.insight_service.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.temuka.insight_service.entity.SearchIndex;

import java.util.List;

@Repository
public interface SearchIndexRepository extends MongoRepository<SearchIndex, String> {

    List<SearchIndex> findByType(String type);

    List<SearchIndex> findByTextContainingIgnoreCase(String text);

    List<SearchIndex> findByTypeAndTextContainingIgnoreCase(String type, String text);
}
