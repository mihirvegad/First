package com.codersfarm.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VApplication {
	  @GetMapping("/")
		public String v() {
		return "hurrey!! Deployee succesfully";
	}
	@GetMapping("/login")
	public String v() {
	return "login";
}
	public static void main(String[] args) {
		SpringApplication.run(VApplication.class, args);
	}

}
