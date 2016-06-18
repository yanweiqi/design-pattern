package com.behavioral.strategy.application.client.init.impl;

import com.behavioral.strategy.application.client.init.IInitializers;
import com.behavioral.strategy.application.client.init.even.IHandlerRegistry;
import com.behavioral.strategy.application.client.init.even.impl.HandlerRegistryImpl;

public class InitializersImpl implements IInitializers {

	@Override
	public IHandlerRegistry events() {
		return new HandlerRegistryImpl();
	}

    
}
