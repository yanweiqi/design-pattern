package com.behavioral.strategy.application.client.init.schedule;

import java.util.Date;

/**
 * Created by yujianming on 2016/2/19.
 * 计划规则
 */
public interface IScheduleRule {

    /**
     * 判断是否执行计划
     * @param currentDate
     * @return true/false
     */
    public boolean checkTriggerEvent(Date currentDate);
}
