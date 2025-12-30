package com.temuka.insight_service.consumer;

import java.time.Instant;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.temuka.insight_service.dto.event.SearchSyncEventDTO;
import com.temuka.insight_service.entity.SearchIndex;
import com.temuka.insight_service.repository.SearchIndexRepository;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class SearchIndexConsumer {

    private final SearchIndexRepository searchIndexRepository;
    
    @RabbitListener(queues = "search.sync.queue")
    public void handleSearchSync(SearchSyncEventDTO event) {
        if ("DELETE".equals(event.getOperation())) {
            searchIndexRepository.deleteById(event.getEntityId());
        }

        SearchIndex index = SearchIndex.builder()
            .id(event.getEntityId())
            .type(event.getType())
            .title((String) event.getData().getOrDefault("title", ""))
            .content((String) event.getData().getOrDefault("content", ""))
            .contextId((String) event.getData().get("communityId")) 
            .scoreMultiplier(Double.valueOf(event.getData().getOrDefault("likeCount", 0).toString()))
            .createdAt(Instant.now())
            .previewMetaData(event.getData())
            .build();

        searchIndexRepository.save(index);
    }
}
