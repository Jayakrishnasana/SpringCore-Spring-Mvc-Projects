package com.jsp.orderservice.serviceImp;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.jsp.orderservice.dto.OrderDto;
import com.jsp.orderservice.entity.OrderEntity;
import com.jsp.orderservice.service.OrderService;



@Service
public class OrderServiceImp implements OrderService {

	@Autowired
	private RestTemplate resTemplate;
	
	@Override
	public String placeOrder(OrderDto orderDto) {
		 OrderEntity orderEntity = new OrderEntity();
		 orderEntity.setProductid(orderEntity.getProductid());
		 orderEntity.setPaymentmode(orderEntity.getPaymentmode());
		 orderEntity.setQuantity(orderEntity.getQuantity());
		 orderEntity.setSolddate(new Date());
		 orderEntity.setTotalprice(0.0);
		 
		 StringBuilder urlBuilder = new StringBuilder();
		 urlBuilder.append("http://localhost:8080/Order_Service/findProductPriceByProductId/");
		 urlBuilder.append(orderDto.getProductId());
		 
		 
		 Double productPrice = resTemplate.getForObject(urlBuilder.toString(), Double.class);
		 System.out.println("productPrice : "+productPrice);
		 orderEntity.setTotalprice(productPrice * orderDto.getQuantity());
		 
		 return "Order Placed successfully";
	}

	

	
}
