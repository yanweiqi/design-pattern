package com.behavioral.strategy.shop.impl;

import java.util.Arrays;
import java.util.List;

import com.behavioral.strategy.shop.IPurchaseRequest;
import com.behavioral.strategy.shop.ShopStrategy;

public class MyShopStrategyImpl implements ShopStrategy {
	
	
	@Override
	public void init(IPurchaseRequest purchaseRequest) {
		System.out.println("进入初始化方法");
		purchaseRequest.even(  () -> {
			List<String> goods = Arrays.asList("AA","BB");
		    return goods;
		}) ;
		
	}

}
