package com.behavioral.strategy.application.client.init;



import com.behavioral.strategy.application.client.init.even.IHandlerRegistry;

/**
 * Created by yujianming on 2016/1/28. <br>
 * 初始化接口
 */

public interface IInitializers {


    IHandlerRegistry events();

   
}
