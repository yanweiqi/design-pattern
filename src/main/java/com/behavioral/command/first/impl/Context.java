/**  
 * @project:Patter_demo
 * @package:com.demo.patter.impl
 * @file£ºContext.java  
 * @author:yanweiqi@yeah.net 
 * @version£º  
 * @since£º2013-5-20  
 * @copyright xxx
 */
package com.behavioral.command.first.impl;

import com.behavioral.strategy.first.Strategy;



/**
 * PatternBox: "Context" implementation.
 * <ul>
 *   <li>is configured with a ConcreteStrategy object.</li>
 *   <li>maintains a reference to a Strategy object.</li>
 *   <li>may define an interface that lets Strategy access its data.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author yanweiqi
 */
public class Context {

	/** stores the Strategy instance of the Context */
	private final Strategy fStrategy;

	/** 
	 * Constructor
	 */
	public Context(Strategy strategy) {
		super();
		fStrategy = strategy;
	}

	/** 
	 * This method invokes the algorithm interface of the current Strategy
	 */
	public void contextInterface() {
		fStrategy.algorithmInterface();
	}

}
