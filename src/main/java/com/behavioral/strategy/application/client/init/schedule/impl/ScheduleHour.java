package com.behavioral.strategy.application.client.init.schedule.impl;



import java.time.LocalDateTime;
import java.util.Date;

import com.behavioral.strategy.application.client.init.utils.DateUtils;

/**
 * Created by yujianming on 2016/2/19.
 */
public class ScheduleHour extends  ScheduleBase {

    @Override
    public boolean checkTrigger(Date date) {
        LocalDateTime dateTime = DateUtils.parseLocalDateTime(date);
        if(dateTime.getHour() % this.getSchedule() != 0){
            return false;
        }



        if(dateTime.getMinute() != 0){
            return false;
        }

        return true;
    }
}
