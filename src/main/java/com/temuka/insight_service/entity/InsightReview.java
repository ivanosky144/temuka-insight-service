package com.temuka.insight_service.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.index.TextIndexed;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "insight_reviews")
public class InsightReview {

    @Id
    private String id;

    @Indexed
    private String userId;

    @Indexed
    private String universityId;

    @Indexed
    private String majorId;

    private double rating;

    private List<String> tags;

    private double sentimentScore;

    @TextIndexed
    private String reviewText;

    @Indexed
    private Instant createdAt;

    private UniversityMeta universityMeta;
    private MajorMeta majorMeta;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class UniversityMeta {
        private String name;
        private String country;
    }

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class MajorMeta {
        private String name;
    }
}
