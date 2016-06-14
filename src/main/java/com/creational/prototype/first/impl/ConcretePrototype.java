/**  
 * @project:Patter_demo
 * @package:com.factory.patter.impl
 * @file：ConcretePrototype.java  
 * @author:yanweiqi@yeah.net 
 * @version：  
 * @since：2013-5-20  
 * @copyright xxx
 */
package com.creational.prototype.first.impl;

import com.creational.prototype.first.Prototype;



/**
 * @author yanweiqi
 */
public class ConcretePrototype implements Prototype {

	/** 
	 * Creates a new instance by cloning itself.
	 */
	public Prototype toClone() throws CloneNotSupportedException {
		return (Prototype) this.clone();
	}

	/** 
	 * This is just a dummy method that can be called by the client. Replace
	 * this method by another one which you really need.
	 */
	public void doSomething() {
		System.out.println("原型模式实现类");  
	}

}
