package com.behavioral.strategy.application.client.init.schedule.impl;

import com.behavioral.strategy.application.client.init.schedule.ISchedule;

/**
 * Created by yujianming on 2016/2/21.
 */
public abstract class ScheduleBase implements ISchedule {

    protected Integer schedule;

    protected Integer count = 0;

    protected Integer current = -1;

    @Override
    public Integer getSchedule() {
        return schedule;
    }
    @Override
    public void setSchedule(Integer schedule) {
        this.schedule = schedule;
    }
}
