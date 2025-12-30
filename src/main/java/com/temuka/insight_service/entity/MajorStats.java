package com.temuka.insight_service.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "insight_major_stats")
public class MajorStats {

    @Id
    private String id; // majorId

    private String majorName;

    private double avgRating;

    private long totalReviews;

    private List<String> commonKeywords;
}
