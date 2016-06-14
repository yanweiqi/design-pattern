/**  
 * @project:Patter_demo
 * @package:com.demo.patter
 * @file��ConcreteCommand.java  
 * @author:yanweiqi@yeah.net 
 * @version��  
 * @since��2013-5-20  
 * @copyright xxx
 */
package com.behavioral.command.first.impl;

import com.behavioral.command.first.Command;
import com.behavioral.command.first.Receiver;



/**
 * 
 * ���������ɫ��Concrete Command����
 * ��һ�������߶������һ�����������ý�������Ӧ�Ĳ�������ʵ�������ɫ������ִ�в����Ľӿڡ�
 * @author yanweiqi
 */
public class ConcreteCommand implements Command {

	/** stores the Receiver instance of the ConcreteCommand */
	private final Receiver fReceiver;

	/** 
	 * Constructor
	 */
	public ConcreteCommand(Receiver receiver) {
		super();
		fReceiver = receiver;
	}

	/** 
	 * This method executes the command by invoking the corresponding
	 * method of the Receiver instance.
	 */
	public void execute() {
		fReceiver.action();
	}

}
