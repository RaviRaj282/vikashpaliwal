package com.example.demo.resources;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloService {
	Date d = null;

	@GetMapping("/hello")
	public String Hello() {
		d = new Date();

		return " This is form hello service::::" + d;

	}

}
