package com.batch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication(scanBasePackages = "com.batch.core")
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
