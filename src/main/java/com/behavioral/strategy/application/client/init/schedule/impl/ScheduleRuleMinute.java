package com.behavioral.strategy.application.client.init.schedule.impl;


import java.util.Date;

import com.behavioral.strategy.application.client.init.schedule.IScheduleRule;

/**
 * Created by yujianming on 2016/2/21.
 */
public class ScheduleRuleMinute implements IScheduleRule {

    private ScheduleRuleDay scheduleRuleDay;

    private ScheduleMinute scheduleMinute;

    public ScheduleRuleMinute(){}

    public ScheduleRuleMinute(ScheduleMinute schedule){
        this.scheduleMinute = schedule;
    }

    @Override
    public boolean checkTriggerEvent(Date currentDate) {
        if(this.scheduleRuleDay != null && !scheduleRuleDay.checkTriggerEvent(currentDate)){
            return false;
        }
        if(this.scheduleMinute != null && !scheduleMinute.checkTrigger(currentDate)){
            return false;
        }
        return true;
    }

    public ScheduleRuleDay getScheduleRuleDay() {
        return scheduleRuleDay;
    }

    public void setScheduleRuleDay(ScheduleRuleDay scheduleRuleDay) {
        this.scheduleRuleDay = scheduleRuleDay;
    }

    public ScheduleMinute getScheduleMinute() {
        return scheduleMinute;
    }

    public void setScheduleMinute(ScheduleMinute scheduleMinute) {
        this.scheduleMinute = scheduleMinute;
    }

}
