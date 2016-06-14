package com.behavioral.command.second;


public class CommandReflect {
	private int inital;
	public CommandReflect(int in) {
		inital = in;
	}
	public int addOne(Integer one) {
		return inital + one.intValue();
	}
	
	public int addTwo(Integer one, Integer two) {
		return inital + one.intValue() + two.intValue();
	}
	

}
