package com.behavioral.strategy.first.impl;

import com.behavioral.strategy.first.Strategy;

public class ConcreteStrategy implements Strategy {

	public ConcreteStrategy() {
		super();
	}

	public void algorithmInterface() {
		System.out.println("这是策略模式的实现一");
	}

}
