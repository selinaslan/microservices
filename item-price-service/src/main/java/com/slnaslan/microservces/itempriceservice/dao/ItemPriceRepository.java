package com.slnaslan.microservces.itempriceservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slnaslan.microservces.itempriceservice.bean.ItemValue;

public interface ItemPriceRepository extends JpaRepository<ItemValue, Long>{

	ItemValue findByItem(String item);

}
