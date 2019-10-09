package com.slnaslan.microservces.pricecalculatorservice.bean;

import java.math.BigDecimal;

public class PriceCalculatorBean {

	private Long id;
	private String item;
	private BigDecimal price;
	private BigDecimal quantity;
	private BigDecimal totalAmount;
	int port;

	public PriceCalculatorBean() {

	}

	public PriceCalculatorBean(Long id, String item, BigDecimal price, BigDecimal quantity, BigDecimal totalAmount,
			int port) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
		this.quantity = quantity;
		this.totalAmount = totalAmount;
		this.port = port;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

}
