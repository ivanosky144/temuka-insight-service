package com.temuka.insight_service.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "trending_stats")
public class TrendingStats {

    @Id
    private String category; // "posts", "majors", "universities"

    private List<String> topIds; // id references to models
}
