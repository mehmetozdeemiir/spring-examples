package com.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories //MongoRepository enable ettik
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
