package com.temuka.insight_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.temuka.insight_service.entity.SearchIndex;
import com.temuka.insight_service.repository.SearchIndexRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SearchIndexService {

    private final SearchIndexRepository searchIndexRepository;

    public SearchIndex save(SearchIndex searchIndex) {
        return searchIndexRepository.save(searchIndex);
    }

    public List<SearchIndex> searchUsers(String text) {
        return searchIndexRepository
                .findByTypeAndTextContainingIgnoreCase("user", text);
    }

    public List<SearchIndex> searchPosts(String text) {
        return searchIndexRepository
                .findByTypeAndTextContainingIgnoreCase("post", text);
    }

    public List<SearchIndex> searchCommunities(String text) {
        return searchIndexRepository
                .findByTypeAndTextContainingIgnoreCase("community", text);
    }

    public List<SearchIndex> searchMajors(String text) {
        return searchIndexRepository
                .findByTypeAndTextContainingIgnoreCase("major", text);
    }

    public List<SearchIndex> searchUniversities(String text) {
        return searchIndexRepository
                .findByTypeAndTextContainingIgnoreCase("university", text);
    }

    public List<SearchIndex> autocomplete(String text) {
        return searchIndexRepository
                .findByTextContainingIgnoreCase(text);
    }

}
