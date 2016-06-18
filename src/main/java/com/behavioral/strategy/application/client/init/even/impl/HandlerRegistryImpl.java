package com.behavioral.strategy.application.client.init.even.impl;

import com.behavioral.strategy.application.client.init.even.IHandlerRegistry;
import com.behavioral.strategy.application.client.init.even.IStatisticsUpdateHandler;

public class HandlerRegistryImpl implements IHandlerRegistry {
	
	public HandlerRegistryImpl(){
		System.out.println("注册事件");
	}

	@Override
	public void statistics(IStatisticsUpdateHandler handler) {
		System.out.println("统计");
	
	}

}
