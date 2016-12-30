package com.learn.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan("com.learn.controller")
public class AppInitializer{

    public static void main(String[] args) throws Exception{
        SpringApplication.run(AppInitializer.class, args);
    }
}