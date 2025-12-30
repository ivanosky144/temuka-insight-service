package com.temuka.insight_service.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.index.Indexed;

import java.time.Instant;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "insight_posts")
public class InsightPost {

    @Id
    private String id;

    @Indexed
    private String userId;

    @Indexed
    private String communityId;

    @TextIndexed
    private String content;

    private List<String> mediaUrls;

    private int likeCount;
    private int commentCount;

    @Indexed
    private Instant createdAt;

    private List<String> tags;

    private List<String> keywords;

    private double boostScore;
}
