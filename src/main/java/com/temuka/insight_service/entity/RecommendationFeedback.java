package com.temuka.insight_service.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "recommendation_feedbacks")
public class RecommendationFeedback {

    @Id
    private String id;

    @Indexed
    private String userId;

    @Indexed
    private String targetId;

    private String action; // "click", "dismiss", "save", etc.

    private Instant timestamp;
}
