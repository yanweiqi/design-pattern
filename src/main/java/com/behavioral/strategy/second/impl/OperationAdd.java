package com.behavioral.strategy.second.impl;

import com.behavioral.strategy.second.Strategy;

public class OperationAdd implements Strategy {
	
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}