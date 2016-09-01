package com.example;

import javax.servlet.Filter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.web.filter.ShallowEtagHeaderFilter;

@SpringBootApplication
//@EnableDiscoveryClient -- not required when zuul proxy is used
@EnableZuulProxy


public class GateWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(GateWayApplication.class, args);
	}
	
	/**
	 * 
	 * maps requests to appropriate service classes
	 */
	/*@Bean
	public Filter shalloEtagHeaderFilter(){
		return new ShallowEtagHeaderFilter();
	}*/
}
