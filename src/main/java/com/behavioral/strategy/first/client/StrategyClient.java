/**  
 * @project:Patter_demo
 * @package:com.demo.patter.clinet
 * @file��StrategyClient.java  
 * @author:yanweiqi@yeah.net 
 * @version��  
 * @since��2013-5-20  
 * @copyright xxx
 */
package com.behavioral.strategy.first.client;

import com.behavioral.command.first.impl.Context;
import com.behavioral.strategy.first.impl.ConcreteStrategy;



/**  
 * �����ƣ�StrategyClient  
 * ��������(������һ�仰�����������������)  
 * �����ˣ�yanweiqi@yeah.net  
 * ����ʱ�䣺2013-5-20 ����02:22:22 
 * @update:[�������YYYY-MM-DD][����������][�������] 
 */
public class StrategyClient {


	/**
	 * ���������� ����ģʽ�Ŀͻ��˵���
	 * @author:yanweiqi@yeah.net 
	 * @method:main 
	 * @param args
	 * @return:void
	 * @since 2013-5-20 ����02:26:30
	 * @update:[�������YYYY-MM-DD][����������][�������]
	 */
	public static void main(String[] args) {
        Context c = new Context(new ConcreteStrategy());
        c.contextInterface();
	}

}
