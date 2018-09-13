package com.numions.infoOrder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.ArrayList;

@SpringBootApplication //
@EnableDiscoveryClient
public class ExampleApplication {


	public static void main(String[] args) {

		SpringApplication.run(ExampleApplication.class, args); /*Ejecutar aplicacion de forma aislada*/
	}
}
