package com.behavioral.strategy.application.client.init.schedule.impl;

import com.behavioral.strategy.application.client.init.schedule.IScheduleDateRule;
import com.behavioral.strategy.application.client.init.schedule.IScheduleMarketRule;

/**
 * Created by yujianming on 2016/2/21.
 */
public class ScheduleRuleMonth implements IScheduleDateRule {

    private ScheduleMonth scheduleMonth;

    public ScheduleRuleMonth(ScheduleMonth scheduleMonth){
        this.scheduleMonth = scheduleMonth;
    }

    @Override
    public IScheduleMarketRule offset(ScheduleDay day) {
        this.scheduleMonth.setScheduleDay(day);
        ScheduleRuleDay rule = new ScheduleRuleDay();
        rule.setScheduleMonth(this.scheduleMonth);
        return rule;
    }

    @Override
    public IScheduleMarketRule weekday(int n) {
        scheduleMonth.setWeekday(n);
        ScheduleRuleDay rule = new ScheduleRuleDay();
        rule.setScheduleMonth(this.scheduleMonth);
        return rule;
    }

}
