package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 
 * @author vgunturu
 *
 */
@SpringBootApplication
@RestController
public class HelloWorld {
	/**
	 * 
	 * @return
	 */
	@RequestMapping("/")
	public String home() {
		return "Hello World";
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(HelloWorld.class, args);
	}
}
