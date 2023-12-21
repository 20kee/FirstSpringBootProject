package com.example.springboot2;

import org.hibernate.service.spi.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot2Application {

    public static void main(String[] args) {

        ApplicationContext ac = SpringApplication.run(Springboot2Application.class, args);
    }

}
