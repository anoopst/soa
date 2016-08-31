package com.example;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NewResources {

	@RequestMapping(value = "/test", produces = MediaType.TEXT_PLAIN_VALUE)
	public String sayHello() {
		return "Hello World";
	}

}
