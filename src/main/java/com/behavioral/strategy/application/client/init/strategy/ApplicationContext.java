package com.behavioral.strategy.application.client.init.strategy;

public class ApplicationContext {
	
	private IStrategy iStrategy;
	
	public ApplicationContext(IStrategy iStrategy){
		this.iStrategy = iStrategy;
	}
	
    public void excute(){
    	iStrategy.todo();
    }

}
