package com.example.amigos.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.JULY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student busola = new Student("Busola",
                    "busoladipo@gmail.com",
                    LocalDate.of(1992, APRIL, 07));

            Student gbemi = new Student("Gbemi",
                    "gbemiajayi@gmail.com",
                    LocalDate.of(1993, JULY, 8));

            repository.saveAll(
                    List.of(busola, gbemi)
            );
        };

    }
}

