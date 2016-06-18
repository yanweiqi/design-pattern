package com.behavioral.strategy.application.client.init.schedule.impl;



import java.util.Calendar;
import java.util.Date;

/**
 * Created by yujianming on 2016/2/21.
 */
public class ScheduleWeek extends  ScheduleBase {

    private ScheduleDay scheduleDay;

    private Integer weekday;

    public ScheduleDay getScheduleDay() {
        return scheduleDay;
    }

    public void setScheduleDay(ScheduleDay scheduleDay) {
        this.scheduleDay = scheduleDay;
    }

    public Integer getWeekday() {
        return weekday;
    }

    public void setWeekday(Integer weekday) {
        this.weekday = weekday;
    }

    @Override
    public boolean checkTrigger(Date date) {
        Calendar ca = Calendar.getInstance();
        ca.setTime(date);
        if(current != ca.get(Calendar.WEEK_OF_YEAR)){
            count++;
            current = ca.get(Calendar.WEEK_OF_YEAR);
        }

        if(this.count % this.schedule != 0){
            return false;
        }





        //每n星期的星期几执行
        if(weekday != null){
            if(weekday != (ca.get(Calendar.DAY_OF_WEEK)-1)){
                return false;
            }
        }

        return true;
    }
}
