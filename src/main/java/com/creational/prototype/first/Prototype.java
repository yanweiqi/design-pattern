/**  
 * @project:Patter_demo
 * @package:com.factory.patter
 * @file£ºPrototype.java  
 * @author:yanweiqi@yeah.net 
 * @version£º  
 * @since£º2013-5-20  
 * @copyright xxx
 */
package com.creational.prototype.first;

/**
 *
 * @author yanweiqi
 */
public interface Prototype extends Cloneable {

	/** 
	 * Creates a new instance by cloning itself.
	 */
	public Prototype toClone() throws CloneNotSupportedException;

	/** 
	 * This is just a dummy method that can be called by the client. Replace
	 * this method by another one which you really need.
	 */
	public void doSomething();

}
