package com.bootstrap.myproj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.bootstrap.myproj.Entity")
@EnableJpaRepositories(basePackages = "com.bootstrap.myproj.MyRepository")

public class MyprojApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyprojApplication.class, args);
    }

}
