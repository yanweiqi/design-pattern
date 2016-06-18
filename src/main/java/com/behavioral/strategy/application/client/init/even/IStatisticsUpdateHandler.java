package com.behavioral.strategy.application.client.init.even;

/**
 * Created by yujianming on 2016/1/28.
 */
@FunctionalInterface
public interface IStatisticsUpdateHandler {
	
	/**
	 * 提供给用户的核心方法，用户可以根据此方法编写自己的业务逻辑
	 * @param stats 个股交易的list，IStatisticsGroup
	 * @param info  回测时的持仓信息. IInfoPacks
	 * @param trans TransactionFactory
	 */
    void handle(TransactionFactory trans);

}
