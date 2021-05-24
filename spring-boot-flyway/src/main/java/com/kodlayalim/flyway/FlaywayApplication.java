package com.kodlayalim.flyway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FlaywayApplication {
    public static void main(String[] args) {
        SpringApplication.run(FlaywayApplication.class,args);
    }
}

//docker ile postgresql e bağlanıp migration yapılmıştır.