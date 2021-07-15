package com.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * The server runs in port 9999 and the services are connected
 * with this port and displayed under instances registered with Eureka
 * 1. UserService
 * 2. AdminService
 * 3. FlightService
 * 4. ZuulService
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaApplication.class, args);
	}

}
