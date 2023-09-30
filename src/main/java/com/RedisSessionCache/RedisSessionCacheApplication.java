package com.RedisSessionCache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class RedisSessionCacheApplication {

	public static void main(String[] args) {
		SpringApplication.run(RedisSessionCacheApplication.class, args);
	}

	@GetMapping("/")
	String hello(){
		return "Hello";
	}

}
