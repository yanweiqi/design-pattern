/**  
 * @project:Patter_demo
 * @package:com.demo.patter
 * @file：Receiver.java  
 * @author:yanweiqi@yeah.net 
 * @version：  
 * @since：2013-5-20  
 * @copyright xxx
 */
package com.behavioral.command.first;

/**
 * 接收者角色（Receiver）：
 * 知道如何实施与执行一个请求相关的操作。任何类都可能作为一个接收者。
 * @author yanweiqi
 */
public class Receiver {

	/** 
	 * This construtor creates a Receiver instance.
	 */
	public Receiver() {
		super();
	}

	/** 
	 * This method performs an action.
	 */
	public void action() {

		//真正执行命令操作的功能代码
		System.out.println("我收到命令，并开始执行");

	}

}
