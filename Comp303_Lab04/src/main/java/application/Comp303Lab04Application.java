package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class Comp303Lab04Application {

	public static void main(String[] args) {
		SpringApplication.run(Comp303Lab04Application.class, args);
		System.out.println("Eureka Server started");
	}

}
