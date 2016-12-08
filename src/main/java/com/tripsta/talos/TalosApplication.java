package com.tripsta.talos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"com.tripsta.talos"})
@EnableJpaRepositories(basePackages = {"com.tripsta.talos.persistence.repositories"})
@EntityScan(value = "com.tripsta.talos.persistence.entities")
public class TalosApplication {

	public static void main(String[] args) {
		SpringApplication.run(TalosApplication.class, args);
	}
}
