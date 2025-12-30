package com.temuka.insight_service.service;

import com.temuka.insight_service.entity.UserProfileVector;
import org.springframework.stereotype.Service;
import com.temuka.insight_service.repository.UserProfileVectorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserProfileVectorService {

    private final UserProfileVectorRepository userProfileVectorRepository;

    public UserProfileVector save(UserProfileVector userProfileVector) {
        return userProfileVectorRepository.save(userProfileVector);
    }
}
