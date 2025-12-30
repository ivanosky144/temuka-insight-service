package com.temuka.insight_service.dto.response;

import java.util.List;

import com.temuka.insight_service.entity.SearchIndex;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SearchResponseDTO {

    private List<SearchIndex> content;

    private int pageNumber;
    private int pageSize;
    private long totalElements;
    private int totalPages;
    private boolean last;

    private String query;
}
