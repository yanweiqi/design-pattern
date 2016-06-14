/**  
 * @project:Patter_demo
 * @package:com.demo.patter.clinet
 * @file£ºSingletonClient.java  
 * @author:yanweiqi@yeah.net 
 * @version£º  
 * @since£º2013-5-20  
 * @copyright xxx
 */
package com.creational.singleton.first.client;

import com.creational.singleton.first.Singleton;



/**
 * PatternBox: "Client" implementation.
 * <ul>
 *   <li>requests the Singleton to get its unique instance.</li>
 * </ul>
 * 
 * @author Dirk Ehms, <a href="http://www.patternbox.com">www.patternbox.com</a>
 * @author yanweiqi
 */
public class SingletonClient {

	/** 
	 * Default constructor
	 */
	public SingletonClient() {
		super();
	}

	/** 
	 * This is just an example how to use the Singleton pattern. This operation
	 * must be customized based on your application needs.
	 */
	public static void useSingleton() {
		Singleton singleton = Singleton.getUniqueInstance();
		singleton.doSomething();
	}

	public static void main(String[] args){
		 SingletonClient.useSingleton();
	}
}
