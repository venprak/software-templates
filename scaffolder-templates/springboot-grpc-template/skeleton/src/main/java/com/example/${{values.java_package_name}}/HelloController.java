package com.example.${{values.java_package_name}};

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*; 
import java.time.*; 

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
   		LocalDateTime now = LocalDateTime.now(); 
		String s= "Greetings from Spring Boot! - Venkat Server "+now.toString();
		return s;
	}

}
