package com.example.demoazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class DemoazureApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoazureApplication.class, args);
	}
	@RequestMapping("/")
	String Home() {
		return "Welcome to first Page of migrated App!!!";
	}

}
