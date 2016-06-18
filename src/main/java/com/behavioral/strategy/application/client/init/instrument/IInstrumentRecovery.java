package com.behavioral.strategy.application.client.init.instrument;

import com.behavioral.strategy.application.client.init.domain.IInfoPacks;

/**
 * Created by yanweiqi on 2016/6/3.
 * 股票复权除权业务接口
 */
public interface IInstrumentRecovery {

    /**
     * 重新构建IInfoPacks对象,改变用户的持仓对象
     * @param infoPacks
     * @return
     * @throws Exception
     */
    IInfoPacks builderInfoPacks(IInfoPacks infoPacks) throws Exception;
}
