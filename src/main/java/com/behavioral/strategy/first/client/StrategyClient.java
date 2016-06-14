/**  
 * @project:Patter_demo
 * @package:com.demo.patter.clinet
 * @file：StrategyClient.java  
 * @author:yanweiqi@yeah.net 
 * @version：  
 * @since：2013-5-20  
 * @copyright xxx
 */
package com.behavioral.strategy.first.client;

import com.behavioral.command.first.impl.Context;
import com.behavioral.strategy.first.impl.ConcreteStrategy;



/**  
 * 类名称：StrategyClient  
 * 类描述：(这里用一句话描述这个方法的作用)  
 * 创建人：yanweiqi@yeah.net  
 * 创建时间：2013-5-20 下午02:22:22 
 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述] 
 */
public class StrategyClient {


	/**
	 * 功能描述： 策略模式的客户端调用
	 * @author:yanweiqi@yeah.net 
	 * @method:main 
	 * @param args
	 * @return:void
	 * @since 2013-5-20 下午02:26:30
	 * @update:[变更日期YYYY-MM-DD][更改人姓名][变更描述]
	 */
	public static void main(String[] args) {
        Context c = new Context(new ConcreteStrategy());
        c.contextInterface();
	}

}
