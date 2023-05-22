package com.zx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class TestApplication {
    public static void main(String[] args) {
        try {
            SpringApplication.run(TestApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
