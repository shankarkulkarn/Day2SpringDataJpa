package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.cg.ems.dao")
public class Day2SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Day2SpringDataJpaApplication.class, args);
	}

}
