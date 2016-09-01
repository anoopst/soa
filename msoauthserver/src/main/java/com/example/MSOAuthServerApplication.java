package com.example;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

@SpringBootApplication
@EnableDiscoveryClient
@EnableWebSecurity
public class MSOAuthServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MSOAuthServerApplication.class, args);
	}
	
	/**
	 * 
	 * maps requests to appropriate service classes
	 */
	@Bean
	public Filter shalloEtagHeaderFilter(){
		return new ShallowEtagHeaderFilter();
	}
}
