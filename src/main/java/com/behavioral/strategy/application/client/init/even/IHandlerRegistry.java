package com.behavioral.strategy.application.client.init.even;



/**
 * Created by yujianming on 2016/3/26.<br>
 * 处理注册
 */
@FunctionalInterface
public interface IHandlerRegistry {
	
	void statistics(IStatisticsUpdateHandler handler);

}
