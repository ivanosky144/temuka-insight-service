package com.temuka.insight_service.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.*;

import java.util.Map;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "user_profile_vectors")
public class UserProfileVector {

    @Id
    private String userId;

    private Map<String, Double> tagWeights;
    private Map<String, Double> majorAffinity;
    private Map<String, Double> universityAffinity;
    private Map<String, Double> communityAffinity;
}
