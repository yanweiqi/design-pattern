package com.behavioral.strategy.application.client.init.strategy;


import java.io.Serializable;

import com.behavioral.strategy.application.client.init.IInitializers;

/**
 * Created by sunguowei on 2016-1-28.<br>
 * 策略接口
 */
public interface IStrategy extends Serializable{

    // init: 策略入口, 我们的策略引擎会在启动时调用这个接口并运行您的策略。
    void init(IInitializers initializers);
    
    void todo();

 
}
