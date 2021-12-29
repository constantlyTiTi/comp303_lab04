package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class Comp303Lab04ProductServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(Comp303Lab04ProductServerApplication.class, args);
	}

}
