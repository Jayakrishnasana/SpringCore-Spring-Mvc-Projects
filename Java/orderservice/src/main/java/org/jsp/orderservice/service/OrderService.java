package org.jsp.orderservice.service;

import org.jsp.orderservice.dto.OrderDTO;

public interface OrderService {
	
	public void processOrder(OrderDTO orderDTO);

}
