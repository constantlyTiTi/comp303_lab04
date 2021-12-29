package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication

public class Comp303Lab04ClientApplication implements WebMvcConfigurer {

	public static void main(String[] args) {
		SpringApplication.run(Comp303Lab04ClientApplication.class, args);
	}
	
	 @Override 
	 public void addViewControllers(ViewControllerRegistry registry) {
		 registry.addViewController("/error").setViewName("error"); 
		 registry.addViewController("/").setViewName("index"); 
		 registry.addViewController("/product").setViewName("product/product");
		 registry.addViewController("/reviewlist").setViewName("product/reviewList");
			 
	 }

}
