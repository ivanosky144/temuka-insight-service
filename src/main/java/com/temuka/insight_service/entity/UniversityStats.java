package com.temuka.insight_service.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "insight_university_stats")
public class UniversityStats {

    @Id
    private String id; // universityId

    private double avgRating;

    private long totalReviews;

    private List<TopMajor> topMajors;

    private List<String> trendingPosts;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class TopMajor {
        private String majorId;
        private double avgRating;
    }
}
