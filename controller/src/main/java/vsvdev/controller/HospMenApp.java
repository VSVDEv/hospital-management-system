package vsvdev.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"vsvdev"})
@EntityScan(basePackages = {"vsvdev"})
@ComponentScan(basePackages = {"vsvdev"})
public class HospMenApp {

    public static void main(String[] args) {
        SpringApplication.run( HospMenApp.class );
    }
}
