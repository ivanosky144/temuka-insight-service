package com.temuka.insight_service.service;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import com.temuka.insight_service.entity.InsightPost;
import com.temuka.insight_service.repository.InsightPostRepository;

import java.util.List;
import java.time.Instant;

@Service
@RequiredArgsConstructor
public class InsightPostService {

    private final InsightPostRepository insightPostRepository;

    public InsightPost save(InsightPost insightPost) {
        return insightPostRepository.save(insightPost);
    }

    public List<InsightPost> getByUser(String userId) {
        return insightPostRepository.findByUserId(userId);
    }

    public List<InsightPost> getByCommunity(String communityId) {
        return insightPostRepository.findByCommunityId(communityId);
    }

    public List<InsightPost> getBetween(Instant start, Instant end) {
        return insightPostRepository.findByCreatedAtBetween(start, end);
    }

    public List<InsightPost> getByTag(String tag) {
        return insightPostRepository.findByTagsContaining(tag);
    }
}
