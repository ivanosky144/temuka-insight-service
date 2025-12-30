package com.temuka.insight_service.service;

import org.springframework.stereotype.Service;

import com.temuka.insight_service.entity.InsightUser;
import com.temuka.insight_service.repository.InsightUserRepository;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Service
@RequiredArgsConstructor
public class InsightUserService {

    private final InsightUserRepository insightUserRepository;

    public InsightUser getByUsername(String username) {
        return insightUserRepository.findByUsername(username);
    }

    public List<InsightUser> getByCommunityJoined(String communityId) {
        return insightUserRepository.findByCommunitiesJoinedContains(communityId);
    }

    public List<InsightUser> getByInterest(String interest) {
        return insightUserRepository.findByInterestsContains(interest);
    }

    public List<InsightUser> getByFollowing(String userId) {
        return insightUserRepository.findByFollowingContains(userId);
    }
}
