package com.temuka.insight_service.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.TextIndexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "search_indexes")
public class SearchIndex {

    @Id
    private String id; // Could be postId, majorId, universityId, etc.

    @TextIndexed
    private String text;

    private String type; // "post", "major", "university", "community", "review", "comment" etc.
}
