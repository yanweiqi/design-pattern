package com.behavioral.strategy.application.client.init.schedule;

import com.behavioral.strategy.application.client.init.schedule.impl.ScheduleHour;
import com.behavioral.strategy.application.client.init.schedule.impl.ScheduleMinute;

/**
 * Created by yujianming on 2016/2/19. <br>
 * 开盘停盘计划
 */
public interface IScheduleMarketRule extends IScheduleRule {

	/**
	 * 开盘按小时计划
	 * @param hour
	 * @return  IScheduleRule
	 */
    public IScheduleRule dayOpen(ScheduleHour hour);

    /**
     * 开盘分钟计划
     * @param minute
     * @return IScheduleRule
     */
    public IScheduleRule dayOpen(ScheduleMinute minute);

    /**
     * 停盘小时计划
     * @param hour
     * @return IScheduleRule
     */
    public IScheduleRule dayClose(ScheduleHour hour);

    /**
     * 停盘分钟计划
     * @param minute
     * @return IScheduleRule
     */
    public IScheduleRule dayClose(ScheduleMinute minute);

}
