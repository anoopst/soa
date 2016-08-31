package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name="lb1",configuration=CustomLoadBalancerConfiguration.class)
public class OrdersLBApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrdersLBApplication.class, args);
	}
}
