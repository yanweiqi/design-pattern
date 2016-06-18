package com.behavioral.strategy.application.client.init.schedule.impl;


import java.util.Date;

/**
 * Created by yujianming on 2016/2/19.
 */
public class ScheduleMinute extends  ScheduleBase {

    public ScheduleMinute(){}

    public ScheduleMinute(Integer schedule){
        this.schedule = schedule;
    }
    @Override
    public boolean checkTrigger(Date date) {

        return true;
    }
}
