package com.example.model;

import java.util.Date;

public class Order {

	private int id;
	private String name;
	private Date orderDate;

	private Boolean active;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Order(int id, String name, Date orderDate, Boolean active) {
		this.id = id;
		this.name = name;
		this.orderDate = orderDate;
		this.active = active;
	}

}
