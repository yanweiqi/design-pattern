package com.behavioral.strategy.application.client.init.utils;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Created by IntelliJ IDEA.
 * User: yfliuwen
 * Date: 12-9-21
 * Time: 下午1:55
 * To change this template use File | Settings | File Templates.
 */
public class DateUtils {

	//日期格式
	private static final SimpleDateFormat DATE_PATTERN = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private static final SimpleDateFormat monthFormat = new SimpleDateFormat("yyyy-MM");
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static final SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyyMMdd");
    private static final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static final ZoneId zone = ZoneId.systemDefault();


	public static Date addDay(String date,int day){
        Date d = transString2Date(date);
        return addDay(d,day);
	}

	public static XMLGregorianCalendar convertToXMLGregorianCalendar(Date date) {
		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(date);
		XMLGregorianCalendar gc = null;
		try {
			gc = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
		} catch (DatatypeConfigurationException e) {
			e.printStackTrace();
		}
		return gc;
	}

    public static Date parseDay(String date) {
        return transString2Date(date);
    }

    public static Date parseDate(LocalDateTime dateTime){
        if(dateTime == null){
            return null;
        }

        return Date.from(dateTime.atZone(zone).toInstant());
    }

    public static LocalDateTime parseLocalDateTime(Date date){
        if(date == null){
            return null;
        }
        return LocalDateTime.ofInstant(date.toInstant(), zone);
    }

	/**
	 *
	 * method: DateUtil  formatDate
	 * @param date
	 * @param format
	 * @return  String
	 */
    public static String formatDate(Date date,String format){
        if(null==date){
            return "";
        }
        SimpleDateFormat myFormatter = new SimpleDateFormat(format);
        return myFormatter.format(date);
    }

    /**
     * 用于VM页面上格式时间
     * method: DateUtil  format
     * @param date
     * @param format
     * @return  String
     * 创建日期： 2012-10-8
     * Copyright(C) 2012, by YJH.
     */
    public static String format(Date date, String format) {
        if(date!=null) {
        	SimpleDateFormat myFormatter = new SimpleDateFormat(format);
        	return myFormatter.format(date);
        }
        return null;
    }

    /**
     * 将字符串转换为精确到毫秒的日期格式
     * @param dateStr 日期字符串
     * @return 返回一个日期对象
     * @throws Throwable 转换出错抛出异常
     */
    public static Timestamp formatTimeStamp(String dateStr) throws Throwable{
    	if(dateStr == null)
    	{
    		return null;
    	}
    	Date date = DATE_PATTERN.parse(dateStr);
    	return new Timestamp(date.getTime());
    }

    /**
     * 根据日期获取当前计算机时间
     * @param dateFormatString
     * @return
     */
    public static Long getLongDate(String dateFormatString){
        Date resultDate=new Date();
        DateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            if(dateFormatString!=null&&!"".equals(dateFormatString)){
                resultDate=dateFormat.parse(dateFormatString);
            }
           return resultDate.getTime();
        } catch (ParseException e) {

        }
        return null;
    }



    public static String getCurrentMonthAsString(){
        Calendar c = Calendar.getInstance();
        return monthFormat.format(c.getTime());
    }

    public static String getCurrentDayAsString(){
        Calendar c = Calendar.getInstance();
        return dateFormat.format(c.getTime());
    }

    public static Date getCurrentDay(){
        Calendar c = Calendar.getInstance();
        return c.getTime();
    }

    public static Date addDay(Date date, int day){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(6, day);
        return c.getTime();
    }

    public static boolean isWeekday(Date date, int weekday){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int current = c.get(7);
        return current == weekday;
    }

    public static boolean isSunday(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int current = c.get(Calendar.DAY_OF_WEEK);
        return current == 1;
    }

    public static boolean isSaturday(Date date){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        int current = c.get(Calendar.DAY_OF_WEEK);
        return current == 7;
    }

    public static String transDate2String(Date date){
        return dateFormat.format(date);
    }

    /**
     * 格式：返回的是20151231这种格式
     * @param date
     * @return
     */
    public static String transDay22String(Date date){
        return dateFormat2.format(date);
    }

    public static Date transString2Date(String s){
        try{
            if(s.length() == 7)
                return monthFormat.parse(s);
            if(s.length() == 8)
                return dateFormat2.parse(s);
            if(s.length() == 10)
                return dateFormat.parse(s);
            if(s.length() == 19)
                return dateTimeFormat.parse(s);
        }
        catch(ParseException e){
            e.printStackTrace();
        }
        return null;
    }

    public static Date addMonth(Date date, int months){
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(2, months);
        return c.getTime();
    }

    public static int getBetweenMonths(Date start, Date end){
        Calendar c = Calendar.getInstance();
        c.setTime(end);
        int year1 = c.get(1);
        int month1 = c.get(2);
        c.setTime(start);
        int year2 = c.get(1);
        int month2 = c.get(2);
        int result;
        if(year1 == year2)
            result = month1 - month2;
        else
            result = (12 * (year1 - year2) + month1) - month2;
        return result;
    }



    public static String toLocalDateString(Date date){
        if(date == null)
        {
            return null;
        } else
        {
            LocalDateTime localDateTime = LocalDateTime.ofInstant(date.toInstant(), zone);
            return localDateTime.toLocalDate().toString();
        }
    }

    public static Date getWeekendDay(Calendar calendar){


        return null;
    }



    public static Date addMinutes(Date date, int minutes) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        c.add(Calendar.MINUTE, minutes);
        return c.getTime();
    }


    public static boolean isSameDay(Date dateA,Date dateB) {
      Calendar calDateA = Calendar.getInstance();
      calDateA.setTime(dateA);

      Calendar calDateB = Calendar.getInstance();
      calDateB.setTime(dateB);

      return calDateA.get(Calendar.YEAR) == calDateB.get(Calendar.YEAR)
              && calDateA.get(Calendar.MONTH) == calDateB.get(Calendar.MONTH)
              &&  calDateA.get(Calendar.DAY_OF_MONTH) == calDateB.get(Calendar.DAY_OF_MONTH);
    }
}