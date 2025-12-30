package com.temuka.insight_service.entity;

import java.time.Instant;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "analytics_events")
public class AnalyticsEvent {
    
    @Id
    private String id;

    @Indexed
    private String userId;

    @Indexed
    private String eventName; // "post_view", "search", "recommendation_click", etc.

    @Indexed
    private Instant timeStamp;

    private String referenceId;

    private Map<String, Object> metadata;
}
