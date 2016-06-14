/**  
 * @project:Patter_demo
 * @package:com.demo.patter
 * @file：Invoker.java  
 * @author:yanweiqi@yeah.net 
 * @version：  
 * @since：2013-5-20  
 * @copyright xxx
 */
package com.behavioral.command.first;

/**
 * 请求者角色（Invoker）：调用命令对象执行这个请求。
 * @author yanweiqi
 */
public class Invoker {

	private Command fCommand;

	/** 
	 * Default constructor
	 */
	public Invoker() {
		super();
	}

	/** 
	 * Constructor
	 */
	public Invoker(Command cmd) {
		super();
		fCommand = cmd;
	}

	/** 
	 * This method stores a ConcreteCommand instance.
	 */
	public void storeCommand(Command cmd) {
		fCommand = cmd;
	}

	/** 
	 * This method performs the actions associated with the ConcreteCommand
	 * instance.
	 */
	public void execute() {
		fCommand.execute();
	}

}
