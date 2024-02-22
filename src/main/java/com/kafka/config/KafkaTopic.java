package com.kafka.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopic {

    // creating kafka topic
    @Bean
    public NewTopic javaTopic(){
        return TopicBuilder.name("java").build();
    }
}
