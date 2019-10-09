package com.slnaslan.microservces.pricecalculatorservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.slnaslan.microservces.pricecalculatorservice.bean.PriceCalculatorBean;

//@FeignClient(name="item-price-service", url="localhost:8000")
//@FeignClient(name="item-price-service")
@FeignClient(name = "netflix-zuul-api-gateway-server")
@RibbonClient(name = "item-price-service")
public interface ItemPriceServiceProxy {

//	@GetMapping("item-price/item/{item}")
	@GetMapping("item-price-service/item-price/item/{item}")
	public PriceCalculatorBean retrieveItemPrice(@PathVariable String item);

}
