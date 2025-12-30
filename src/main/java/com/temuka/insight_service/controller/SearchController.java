package com.temuka.insight_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.temuka.insight_service.entity.SearchIndex;
import com.temuka.insight_service.service.SearchIndexService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/search")
@RequiredArgsConstructor
public class SearchController {

    private final SearchIndexService searchIndexService;

    @GetMapping("/users")
    public List<SearchIndex> searchUsers(@RequestParam String q){
        return searchIndexService.searchUsers(q);
    }

    @GetMapping("/posts")
    public List<SearchIndex> searchPosts(@RequestParam String q){
        return searchIndexService.searchPosts(q);
    }

    @GetMapping("/communities")
    public List<SearchIndex> searchCommunities(@RequestParam String q){
        return searchIndexService.searchCommunities(q);
    }
}
