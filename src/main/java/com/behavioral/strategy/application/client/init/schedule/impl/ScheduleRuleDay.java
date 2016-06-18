package com.behavioral.strategy.application.client.init.schedule.impl;



import java.util.Date;

import com.behavioral.strategy.application.client.init.schedule.IScheduleMarketRule;
import com.behavioral.strategy.application.client.init.schedule.IScheduleRule;

/**
 * Created by yujianming on 2016/2/21.
 */
public class ScheduleRuleDay implements IScheduleMarketRule {

    private ScheduleWeek scheduleWeek;

    private ScheduleMonth scheduleMonth;

    private ScheduleDay scheduleDay = new ScheduleDay();

    private Date lastDate;

    public ScheduleRuleDay(){}

    public ScheduleRuleDay(ScheduleDay schedule){
        this.scheduleDay = schedule;
    }

    @Override
    public IScheduleRule dayOpen(ScheduleHour hour) {
        ScheduleMinute scheduleMinute = new ScheduleMinute();
        scheduleMinute.setSchedule(hour.getSchedule()*60);
        if(scheduleDay == null){
            scheduleDay = new ScheduleDay();
        }
        scheduleDay.setScheduleMinute(scheduleMinute);

        ScheduleRuleMinute scheduleRuleMinute = new ScheduleRuleMinute();
        scheduleRuleMinute.setScheduleRuleDay(this);
        return scheduleRuleMinute;
    }

    @Override
    public IScheduleRule dayOpen(ScheduleMinute minute) {
        if(scheduleDay == null){
            scheduleDay = new ScheduleDay();
        }
        scheduleDay.setScheduleMinute(minute);

        ScheduleRuleMinute scheduleRuleMinute = new ScheduleRuleMinute();
        scheduleRuleMinute.setScheduleRuleDay(this);
        return this;
    }

    @Override
    public IScheduleRule dayClose(ScheduleHour hour) {
        hour.setSchedule(4-hour.getSchedule());
        return this.dayOpen(hour);
    }

    @Override
    public IScheduleRule dayClose(ScheduleMinute minute) {
        minute.setSchedule(240-minute.getSchedule());
        return this.dayOpen(minute);
    }

    @Override
    public boolean checkTriggerEvent(Date currentDate) {

        if(scheduleMonth != null && !scheduleMonth.checkTrigger(currentDate)){
            return false;
        }
        if(scheduleWeek != null && !scheduleWeek.checkTrigger(currentDate)){
            return false;
        }
        if(scheduleDay != null && !scheduleDay.checkTrigger(currentDate)){
            return false;
        }
        return true;
    }

    public void setScheduleWeek(ScheduleWeek scheduleWeek) {
        this.scheduleWeek = scheduleWeek;
    }

    public void setScheduleMonth(ScheduleMonth scheduleMonth) {
        this.scheduleMonth = scheduleMonth;
    }

}
