package com.slnaslan.microservces.itempriceservice.bean;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemValue {
	
	@Id
	private Long id;
	private String item;
	private BigDecimal price;
	int port;

	public ItemValue() {
	}

	public ItemValue(Long id, String item, BigDecimal price) {
		super();
		this.id = id;
		this.item = item;
		this.price = price;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
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

}
