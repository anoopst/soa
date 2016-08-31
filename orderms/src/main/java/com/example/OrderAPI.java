package com.example;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Order;
import com.example.repository.OrderRepository;

@RestController
public class OrderAPI {

	@Autowired
	private OrderRepository orderRepository;

	@RequestMapping(value = "/api/order", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Order> add(@RequestBody Order order) {
		orderRepository.save(order);

		return new ResponseEntity<Order>(order, HttpStatus.CREATED);
	}

	@RequestMapping(value = "/api/order/{id}", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Order> update(@RequestBody Order order, @PathVariable("id") Integer id) {
		Order orderOne = orderRepository.findOne(id);
		if (orderOne != null) {
			orderOne.setActive(order.getActive());
			orderOne.setOrderDate(order.getOrderDate());
			orderOne.setName(order.getName());
			orderRepository.save(orderOne);
		}		

		return new ResponseEntity<Order>(order, HttpStatus.ACCEPTED);
	}

	@RequestMapping(value = "/api/order", method = RequestMethod.GET, produces = {
			MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
	public ResponseEntity<List<Order>> findAll() {
		List<Order> orders =  new ArrayList<>();
		orders.add(new Order(1,"Local Order", new Date(),true));
		return new ResponseEntity<List<Order>>(orders, HttpStatus.OK);
		//return new ResponseEntity<List<Order>>(orderRepository.findAll(), HttpStatus.OK);
	}
	
}
