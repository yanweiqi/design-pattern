/**  
 * @project:Patter_demo
 * @package:com.structural.facade
 * @file£ºFacade.java  
 * @author:yanweiqi@yeah.net 
 * @version£º  
 * @since£º2013-6-5  
 * @copyright xxx
 */
package com.structural.facade.first;

/**
 * @author yanweiqi
 */
public class Facade {

	private pointCarte fSubsystem;

	public Facade() {
		super();
	}

	public void regSubsystem(pointCarte subsystem) {
		this.fSubsystem = subsystem;
	}

	public void callOperation1() {
		fSubsystem.operation1();
	}

	public void callOperation2() {
		fSubsystem.operation2();
	}

	public void callOperation3() {
		fSubsystem.operation3();
	}
}
