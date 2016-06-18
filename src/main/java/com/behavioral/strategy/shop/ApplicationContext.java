package com.behavioral.strategy.shop;

public class ApplicationContext {
	
	private ShopStrategy shopStrategy;
		
	public ShopStrategy getShopStrategy() {
		return shopStrategy;
	}

	public ApplicationContext(ShopStrategy shopStrategy){
		this.shopStrategy = shopStrategy;
	}
	
}
