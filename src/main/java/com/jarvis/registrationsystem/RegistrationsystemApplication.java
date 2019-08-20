package com.jarvis.registrationsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Repository;



@SpringBootApplication(scanBasePackages = "com.jarvis.registrationsystem")
@MapperScan(
        basePackages = "com.jarvis.registrationsystem.*",
        annotationClass = Repository.class)
public class RegistrationsystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(RegistrationsystemApplication.class, args);
    }

}
