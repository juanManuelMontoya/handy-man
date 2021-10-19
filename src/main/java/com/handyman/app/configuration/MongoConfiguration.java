package com.handyman.app.configuration;


import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoClients;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;

@Configuration
public class MongoConfiguration {

    @Bean
    MongoClient mongoClient() {
        return MongoClients.create();
    }

    @Bean
    ReactiveMongoTemplate reactiveMongoTemplate(
            MongoClient mongoClient
    ) {
        return new ReactiveMongoTemplate(mongoClient, "handyman");
    }
}
