package com.temuka.insight_service.service;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.core.query.TextQuery;
import org.springframework.stereotype.Service;

import com.temuka.insight_service.dto.response.SearchResponseDTO;
import com.temuka.insight_service.entity.SearchIndex;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SearchIndexService {

    private final MongoTemplate mongoTemplate;

    public SearchResponseDTO search(String q, String type, String contextId, String sort, int page) {
        TextCriteria criteria = TextCriteria.forDefaultLanguage().matchingAny(q);
        TextQuery query = TextQuery.queryText(criteria);

        if (contextId != null) query.addCriteria(Criteria.where("contextId").is(contextId));
        
        if ("new".equals(sort)) {
            query.with(Sort.by(Sort.Direction.DESC, "createdAt"));
        } else {
            query.sortByScore();
            query.with(Sort.by(Sort.Direction.DESC, "scoreMultiplier"));
        }

        query.with(PageRequest.of(page, 10));;
        List<SearchIndex> results = mongoTemplate.find(query, SearchIndex.class);
        long total = mongoTemplate.count(query, SearchIndex.class);

        return SearchResponseDTO.builder()
            .content(results)
            .pageNumber(page)
            .pageSize(10)
            .totalElements(total)
            .totalPages((int) Math.ceil((double) total / 10))
            .last((page + 1) * 10 >= total)
            .query(q)
            .build();
    }

}
