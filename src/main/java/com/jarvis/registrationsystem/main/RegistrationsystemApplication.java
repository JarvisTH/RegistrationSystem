package com.jarvis.registrationsystem.main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Repository;


@MapperScan(
        basePackages = "com.jarvis.registrationsystem.*",
        annotationClass = Repository.class)
@SpringBootApplication(scanBasePackages = {"com.jarvis.registrationsystem"})
public class RegistrationsystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistrationsystemApplication.class, args);
    }

}
