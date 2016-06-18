package com.behavioral.strategy.application.client;

import com.behavioral.strategy.application.client.init.strategy.ApplicationContext;
import com.behavioral.strategy.application.client.init.strategy.impl.YwqStrategyImpl;

public class Main {
	
	public static void main(String[] args){

        ApplicationContext app = new ApplicationContext(new YwqStrategyImpl());
        app.excute();
        System.out.println("运行完毕");
	
	}
}
