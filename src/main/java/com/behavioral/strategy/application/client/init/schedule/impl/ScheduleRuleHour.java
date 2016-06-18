package com.behavioral.strategy.application.client.init.schedule.impl;


import java.util.Date;

import com.behavioral.strategy.application.client.init.schedule.IScheduleTimeRule;

/**
 * Created by yujianming on 2016/2/21.
 */
public class ScheduleRuleHour implements IScheduleTimeRule {

    private ScheduleHour schedule;

    public ScheduleRuleHour(ScheduleHour schedule){
        this.schedule = schedule;
    }


    @Override
    public boolean checkTriggerEvent(Date currentDate) {
        return schedule.checkTrigger(currentDate);
    }
}
