
package com.behavioral.strategy.first;

public class Context {

	
	private final Strategy strategy;

	public Context(Strategy strategy) {
		super();
		this.strategy = strategy;
	}

	public void contextInterface() {
		strategy.algorithmInterface();
	}

}
