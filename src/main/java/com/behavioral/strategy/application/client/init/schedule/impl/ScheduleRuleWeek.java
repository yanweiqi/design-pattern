package com.behavioral.strategy.application.client.init.schedule.impl;

import com.behavioral.strategy.application.client.init.schedule.IScheduleDateRule;
import com.behavioral.strategy.application.client.init.schedule.IScheduleMarketRule;

/**
 * Created by yujianming on 2016/2/21.
 */
public class ScheduleRuleWeek implements IScheduleDateRule {

    private ScheduleWeek schedule;

    public ScheduleRuleWeek(ScheduleWeek schedule){
        this.schedule = schedule;
    }

    @Override
    public IScheduleMarketRule offset(ScheduleDay day) {
        this.schedule.setScheduleDay(day);
        ScheduleRuleDay dayRule = new ScheduleRuleDay();
        dayRule.setScheduleWeek(this.schedule);
        return dayRule;
    }

    @Override
    public IScheduleMarketRule weekday(int n) {
        this.schedule.setWeekday(n);
        ScheduleRuleDay dayRule = new ScheduleRuleDay();
        dayRule.setScheduleWeek(this.schedule);
        return dayRule;
    }

}
