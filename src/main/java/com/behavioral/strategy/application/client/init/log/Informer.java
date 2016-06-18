package com.behavioral.strategy.application.client.init.log;

import java.io.Serializable;
import java.util.*;

/**
 * Created by sunguowei on 2016-1-28. <br>
 * 日志信息
 */
public class Informer implements Serializable {

	private static final long serialVersionUID = 6789924576383288262L;

	private Date date;

    private List<LogOutput> logList = new ArrayList<LogOutput>();

    private Map<String, Double> plotMap = new HashMap<String, Double>();

    public static Informer newInstance(Date date){
        Informer informer = new Informer();
        informer.setDate(date);
        return informer;
    }

    public List<LogOutput> getLogList() {
        return logList;
    }

    public void setLogList(List<LogOutput> logList) {
        this.logList = logList;
    }

    public  void debug(Object o){
        this.setObject(o, "DEBUG");
    }

    public void debug(String s){
        this.setString(s, "DEBUG");
    }

//    void debug(String s, Object... objects){
//
//    }

    public  void info(Object o){
        this.setObject(o, "INFO");
    }

    public void info(String s){
        this.setString(s, "INFO");
    }

//    void info(String s, Object... objects);

    public void warn(Object o){
        this.setObject(o, "WARN");
    }

    public void warn(String s){
        this.setString(s, "WARN");
    }

//    void warn(String s, Object... objects);

    public void error(Object o){
        this.setObject(o, "ERROR");
    }

    public void error(String s){
        this.setString(s, "ERROR");
    }

    public void error(String s, Object o){
        this.setString(s+o.toString(), "ERROR");
    }

//    void error(String s, Object... objects);

    public void setObject(Object o, String level){
        if(o != null){
            setString(o.toString(), level);
        }
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setString(String s, String level){
        LogOutput log = new LogOutput();
        log.setDate(date);
        log.setLevel(level);
        log.setContent(s);
        this.logList.add(log);
    }

    public void plot(String key, double value){
        this.plotMap.put(key, value);
    }

    public Map<String, Double> getPlotMap() {
        return plotMap;
    }

    public void setPlotMap(Map<String, Double> plotMap) {
        this.plotMap = plotMap;
    }
}
