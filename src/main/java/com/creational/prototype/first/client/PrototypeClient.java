/**  
 * @project:Patter_demo
 * @package:com.factory.patter.client
 * @file��Client.java  
 * @author:yanweiqi@yeah.net 
 * @version��  
 * @since��2013-5-20  
 * @copyright xxx
 */
package com.creational.prototype.first.client;

import com.creational.prototype.first.Prototype;
import com.creational.prototype.first.impl.ConcretePrototype;



/**
 * @author yanweiqi
 */
public class PrototypeClient {


	private final Prototype fPrototype;

	/** 
	 * Constructor
	 */
	public PrototypeClient(Prototype prototype) {
		fPrototype = prototype;
	}
	
    /**
     * ���������� �����������������
     * @author:yanweiqi@yeah.net 
     * @method:usePrototype 
     * @return:void
     * @since 2013-5-20 ����04:31:11
     * @update:[�������YYYY-MM-DD][����������][�������]
     */
	public void usePrototype() {

		try {
			Prototype prototype = fPrototype.toClone(); // create a new prototype without knowing the real implementation class
			prototype.doSomething(); 			// call a Prototype method
		} 
		catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

	/** 
	 * Run application from command line.
	 */
	public static void main(String[] args) {
		new PrototypeClient(new ConcretePrototype()).usePrototype();
	}

}
