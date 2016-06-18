package com.behavioral.strategy.application.client.init.schedule;

import com.behavioral.strategy.application.client.init.schedule.impl.ScheduleDay;

/**
 * Created by yujianming on 2016/2/19.<br>
 * 计划日期规则
 */
public interface IScheduleDateRule {
    
	/**
	 * 偏移天数
	 * @param day
	 * @return
	 */
    public IScheduleMarketRule offset(ScheduleDay day);

    /**
     * 周第几天
     * @param n
     * @return
     */
    public IScheduleMarketRule weekday(int n);

}
