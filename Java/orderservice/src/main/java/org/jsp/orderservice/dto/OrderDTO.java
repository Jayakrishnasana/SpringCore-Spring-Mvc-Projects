package org.jsp.orderservice.dto;

import java.io.Serializable;

public class OrderDTO implements Serializable
{

	private Long productid;
	
	private Double quantity;
	
	private String paymentmode;

	public Long getProductid() {
		return productid;
	}

	public void setProductid(Long productid) {
		this.productid = productid;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	
	
	
}
