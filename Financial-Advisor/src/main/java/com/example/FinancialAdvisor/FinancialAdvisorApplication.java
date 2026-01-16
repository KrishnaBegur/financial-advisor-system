package com.example.FinancialAdvisor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.example.FinancialAdvisor.entity")
@EnableJpaRepositories(basePackages = "com.example.FinancialAdvisor.repository")
public class FinancialAdvisorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FinancialAdvisorApplication.class, args);
	}
}
