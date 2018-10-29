package com.gramcha.turbineaggregatorservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableTurbine
public class TurbineAggregatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TurbineAggregatorServiceApplication.class, args);
	}
}
