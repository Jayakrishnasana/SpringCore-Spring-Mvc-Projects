package org.jsp.orderservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="order_service")
public class OrderEntity {

	@Id
	@GenericGenerator(name = "auto",strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "alt_key")
	private Long altkey;
	
	@Column(name="product_id")
	private Long productid;
	
	@Column(name="quantity")
	private Double quantity;
	
	@Column(name="total_price")
	private Double totalprice;
	
	@Column(name="payment_mode")
	private String paymentmode;
	
	@Column(name="sold_date")
	private String solddate;

	public Long getAltkey() {
		return altkey;
	}

	public void setAltkey(Long altkey) {
		this.altkey = altkey;
	}

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

	public Double getTotalprice() {
		return totalprice;
	}

	public void setTotalprice(Double totalprice) {
		this.totalprice = totalprice;
	}

	public String getPaymentmode() {
		return paymentmode;
	}

	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}

	public String getSolddate() {
		return solddate;
	}

	public void setSolddate(String solddate) {
		this.solddate = solddate;
	}
	
}
