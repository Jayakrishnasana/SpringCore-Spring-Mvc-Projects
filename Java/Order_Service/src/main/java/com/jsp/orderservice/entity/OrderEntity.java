package com.jsp.orderservice.entity;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="order_info")
public class OrderEntity {

	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "alt_key")
	private long altkey;
	
	@Column(name="product_id")
	private long productid;
	
	@Column(name="quantity")
	private long quantity;
	
	@Column(name="total_price")
	private double totalprice;
	
	@Column(name="payment_mode")
	private String paymentmode;
	
	@Column(name="sold_date")
	private Date solddate;

	public long getAltkey() {
		return altkey;
	}

	public void setAltkey(long altkey) {
		this.altkey = altkey;
	}

	public long getProductid() {
		return productid;
	}

	public void setProductid(long productid) {
		this.productid = productid;
	}

	public long getQuantity() {
		return quantity;
	}

	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}

	public double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(double totalprice) {
		this.totalprice = totalprice;
	}

	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

	public Date getSolddate() {
		return solddate;
	}

	public void setSolddate(Date solddate) {
		this.solddate = solddate;
	}

	
}
