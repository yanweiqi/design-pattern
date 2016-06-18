package com.behavioral.strategy.application.client.init.schedule;

import java.util.Date;

/**
 * Created by yujianming on 2016/2/19.
 */
public interface ISchedule {
	
    public void setSchedule(Integer schedule);

    public Integer getSchedule();

    public boolean checkTrigger(Date date);
}
