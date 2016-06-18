package com.behavioral.strategy.shop;

public class IPurchaseRequest {
	
	private  IShopingList  shopingList;
   
	public void even(IShopingList shopList){
		 this.shopingList = shopList;
	}
	
	IShopingList getShopingList(){
		return shopingList;
	}
}
