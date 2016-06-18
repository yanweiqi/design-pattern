package com.behavioral.strategy.shop;

import com.behavioral.strategy.shop.impl.MyShopStrategyImpl;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext app = new ApplicationContext(new MyShopStrategyImpl());
		
		ShopStrategy shopStrategy = app.getShopStrategy();
		
		System.out.println(shopStrategy);
		
		
        
	}

}
