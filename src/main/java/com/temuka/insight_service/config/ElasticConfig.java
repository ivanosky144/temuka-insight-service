package com.temuka.insight_service.config;

import co.elastic.clients.elasticsearch.ElasticsearchClient;
import co.elastic.clients.transport.rest_client.RestClientTransport;
import co.elastic.clients.json.jackson.JacksonJsonpMapper;
import org.elasticsearch.client.RestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ElasticConfig {

    @Value("${elasticsearch.host}")
    private String elasticsearchHost;

    @Value("${elasticsearch.port}")
    private int elasticsearchPort;

    @Bean
    public RestClient restClient() {
        return RestClient.builder(
                new org.apache.http.HttpHost(elasticsearchHost, elasticsearchPort, "http")
        ).setHttpClientConfigCallback(httpClientBuilder ->
                httpClientBuilder.setDefaultIOReactorConfig(
                        org.apache.http.impl.nio.reactor.IOReactorConfig.custom()
                                .setSoKeepAlive(true)
                                .build()
                )
        ).build();
    }

    @Bean
        public ElasticsearchClient elasticsearchClient(RestClient restClient) {
                RestClientTransport transport = new RestClientTransport(
                        restClient, new JacksonJsonpMapper()
                );
                return new ElasticsearchClient(transport);
        }
}
