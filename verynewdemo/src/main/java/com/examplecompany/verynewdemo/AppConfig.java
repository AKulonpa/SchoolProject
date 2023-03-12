package com.examplecompany.verynewdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public OnlineStoreService onlineStoreService() {
        return new OnlineStoreService();
    }
}