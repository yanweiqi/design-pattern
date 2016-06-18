package com.behavioral.strategy.application.client.init.even;

/**
 * Created by yujianming on 2016/1/30.<br>
 * 工厂类对象是一个创建委托
 */
public class TransactionFactory {


    public void buy(String stock){
    	System.out.println("买入股票"+stock);
    }
    
    public void sell(String stock){
    	System.out.println("卖出股票"+stock);
    }
}
