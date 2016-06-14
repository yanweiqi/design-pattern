/**  
 * @project:Patter_demo
 * @package:com.demo.patter.clinet
 * @file��CommondClient.java  
 * @author:yanweiqi@yeah.net 
 * @version��  
 * @since��2013-5-20  
 * @copyright xxx
 */
package com.behavioral.command.first.clinet;

import com.behavioral.command.first.Command;
import com.behavioral.command.first.Invoker;
import com.behavioral.command.first.Receiver;
import com.behavioral.command.first.impl.ConcreteCommand;



/**
 * @author yanweiqi
 */
public class CommondClient {

	public static void main(String[] args) {
		Receiver receiver = new Receiver();
		Command cmd = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker();
		invoker.storeCommand(cmd);
		invoker.execute();
	}

}
