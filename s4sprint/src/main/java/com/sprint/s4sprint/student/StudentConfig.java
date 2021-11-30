package com.sprint.s4sprint.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student mark = new Student(
                    "Mark",
                    "mark.crocker@keyin.com",
                    LocalDate.of(1983, Month.NOVEMBER, 23)

            );

            Student john = new Student(
                    "John",
                    "john.doe@keyin.com",
                    LocalDate.of(1985, Month.DECEMBER, 20)

            );

            repository.saveAll(
                    List.of(mark, john)
            );
        };
    }
}
