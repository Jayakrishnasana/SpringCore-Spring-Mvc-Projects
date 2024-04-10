package org.jsp.orderservice.serviceIMP;

import org.jsp.orderservice.dto.OrderDTO;
import org.jsp.orderservice.entity.OrderEntity;
import org.jsp.orderservice.repository.OrderRepository;
import org.jsp.orderservice.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImp implements OrderService {

	@Autowired
	private OrderRepository orderRepository;
	@Autowired
	private OrderEntity orderEntity;
	
	@Override
	public void processOrder(OrderDTO orderDTO) {
		
		orderEntity.setProductid(orderDTO.getProductid());
		orderEntity.setQuantity(orderDTO.getQuantity());
		orderEntity.setPaymentmode(orderDTO.getPaymentmode());
		orderEntity.setTotalprice(null);
		orderEntity.setSolddate(null);
		orderRepository.processOrder(orderEntity);
		
	}

}
