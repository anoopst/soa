package com.example;

import java.util.Date;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MyResource {

	@RequestMapping(value = "/", produces = MediaType.TEXT_PLAIN_VALUE)
	public String getTimeAsString() {
		return new Date().toString();
	}
}
