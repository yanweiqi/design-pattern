package com.behavioral.strategy.application.client.init.schedule.impl;


import java.util.Calendar;
import java.util.Date;

/**
 * Created by yujianming on 2016/2/19.
 */
public class ScheduleDay extends  ScheduleBase {

    private ScheduleMinute scheduleMinute = new ScheduleMinute(1);

    @Override
    public boolean checkTrigger(Date date) {
        //判断天的周期
        if(this.schedule != null){
            Calendar ca = Calendar.getInstance();
            ca.setTime(date);
            if(current != ca.get(Calendar.DAY_OF_YEAR)){
                count++;
                current = ca.get(Calendar.DAY_OF_YEAR);
            }

            if(this.count % this.schedule != 0){
                return false;
            }
        }

        return true;
    }

    public ScheduleMinute getScheduleMinute() {
        return scheduleMinute;
    }

    public void setScheduleMinute(ScheduleMinute scheduleMinute) {
        this.scheduleMinute = scheduleMinute;
    }
}
