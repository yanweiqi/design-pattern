package com.behavioral.strategy.application.client.init.strategy.impl;

import com.behavioral.strategy.application.client.init.IInitializers;
import com.behavioral.strategy.application.client.init.impl.InitializersImpl;
import com.behavioral.strategy.application.client.init.strategy.IStrategy;

public class YwqStrategyImpl implements IStrategy{


	private static final long serialVersionUID = 6751397265470650348L;

	@Override
	public void init(IInitializers initializers) {
		
		initializers.events().statistics(
			(tran) -> {
				tran.buy("yyyyyy");
			}
		);
	}

	@Override
	public void todo() {
		IInitializers initializers = new InitializersImpl();
		init(initializers);
		
		
	}

}
