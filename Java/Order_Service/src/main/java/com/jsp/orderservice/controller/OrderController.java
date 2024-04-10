package com.jsp.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.orderservice.dto.OrderDto;
import com.jsp.orderservice.service.OrderService;
import com.jsp.orderservice.serviceImp.OrderServiceImp;

@RestController
public class OrderController {
	
	@Autowired
	private OrderServiceImp orderService;
	
	@PostMapping(value = "/intiateOrder")
	public void intiateOrder( @RequestBody OrderDto orderDto) {
		orderService.placeOrder(orderDto);
		System.out.println(orderDto);
	}	
}
