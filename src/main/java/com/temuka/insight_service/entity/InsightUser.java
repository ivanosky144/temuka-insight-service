package com.temuka.insight_service.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "insight_users")
public class InsightUser {

    @Id
    private String id; 

    @Indexed
    private String username;

    private String displayName;

    private List<String> communitiesJoined;

    private List<String> following;

    private List<String> interests;

    private List<Activity> recentActivity;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class Activity {
        private String type; // "post", "review", etc.
        private String referenceId;
        private Instant timestamp;
    }
}
