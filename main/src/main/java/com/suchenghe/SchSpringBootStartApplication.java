package com.suchenghe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SchSpringBootStartApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SchSpringBootStartApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SchSpringBootStartApplication.class);
    }
}
