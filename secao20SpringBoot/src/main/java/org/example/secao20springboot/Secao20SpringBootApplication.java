package org.example.secao20springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "org.example.secao20springboot")
@EnableJpaRepositories(basePackages = "org.example.secao20springboot.models.repositories")
public class Secao20SpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(Secao20SpringBootApplication.class, args);
    }

}
