/**  
 * @project:Patter_demo
 * @package:com.demo.patter
 * @file：Singleton.java  
 * @author:yanweiqi@yeah.net 
 * @version：  
 * @since：2013-5-20  
 * @copyright xxx
 */
package com.creational.singleton.first;

/**
 * PatternBox: "Singleton" implementation.
 * <ul>
 *   <li>defines an Instance operation that lets clients access its unique instance. Instance is a class operation</li>
 *   <li>may be responsible for creating its own unique instance.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author yanweiqi
 */
public class Singleton {

	/** unique instance */
	private static Singleton sInstance = null;

	/** 
	 * Private constuctor
	 */
	private Singleton() {
		super();
	}

	/** 
	 * Get the unique instance of this class.
	 */
	public static synchronized Singleton getUniqueInstance() {

		if (sInstance == null) {
			sInstance = new Singleton();
		}

		return sInstance;

	}

	/** 
	 * This is just a dummy method that can be called by the client. Replace
	 * this method by another one which you really need.
	 */
	public void doSomething() {
		System.out.println("单例做了一些事情！");
	}

}
