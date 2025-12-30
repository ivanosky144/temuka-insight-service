package com.temuka.insight_service.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.temuka.insight_service.repository")
public class MongoConfig {
    
}
