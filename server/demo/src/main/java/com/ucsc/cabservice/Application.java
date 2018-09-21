package com.ucsc.cabservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Jerry Conde, webmaster@javapointers.com
 * @since 8/9/2016
 */
@SpringBootApplication
@EnableJpaRepositories(basePackages = {"com.ucsc.cabservice.repository"})
@EntityScan(basePackages = {"com.ucsc.cabservice.model"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
