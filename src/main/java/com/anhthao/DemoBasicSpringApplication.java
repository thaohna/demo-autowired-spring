package com.anhthao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.anhthao.models.User;

@SpringBootApplication
@EnableAutoConfiguration
public class DemoBasicSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoBasicSpringApplication.class, args);
	}
	
	@Bean
	User getUser() {
		User user = new User();
		
		user.setUsername("Thao");
		user.setPassword("abc");
		
		return user;
	}

}
