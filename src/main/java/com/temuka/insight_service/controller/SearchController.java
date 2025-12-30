package com.temuka.insight_service.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.temuka.insight_service.dto.response.SearchResponseDTO;
import com.temuka.insight_service.service.SearchIndexService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/search")
@RequiredArgsConstructor
public class SearchController {

    private final SearchIndexService searchIndexService;

    @GetMapping
    public ResponseEntity<SearchResponseDTO> handleSearch(
            @RequestParam String q,
            @RequestParam(required = false) String contextId,
            @RequestParam(required = false, defaultValue = "all") String type,
            @RequestParam(required = false, defaultValue = "relevance") String sort,
            @RequestParam(required = false, defaultValue = "0") int page) {

        return ResponseEntity.ok(
            searchIndexService.search(q, type, contextId, sort, page)
        );
    }
}
