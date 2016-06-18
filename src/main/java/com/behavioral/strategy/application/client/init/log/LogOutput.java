package com.behavioral.strategy.application.client.init.log;

import java.io.Serializable;
import java.util.Date;

/**
 * 日志输出
 * Created by yujianming on 2016/1/28.
 */
public class LogOutput implements Serializable {

	private static final long serialVersionUID = -3386010209914955462L;
	
	private Date date;
    private String level;
    private String content;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
