package com.jesus.microservicios.app.examenes.microservicios_examenes;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@EnableEurekaClient
@SpringBootApplication
public class MicroserviciosExamenesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviciosExamenesApplication.class, args);
	}

}
