package com.behavioral.ChainOfResponsibility.first;

public abstract class AbstractLogger {

   public static int INFO  = 1;
   public static int DEBUG = 2;
   public static int ERROR = 3;

   protected int level;

   protected AbstractLogger nextLogger;

   public void setNextLogger(AbstractLogger nextLogger){
      this.nextLogger = nextLogger;
   }

   /**
    * ���������� �����������������
    * @method:logMessage 
    * @param level
    * @param message
    * @since 2013-11-8 ����02:24:35
    * @update:[�������YYYY-MM-DD][����������][�������]
    */
   public void logMessage(int level, String message){
      if(this.level <= level){
         write(message);
      }
      if(null != nextLogger){
         nextLogger.logMessage(level, message);
      }
   }

    protected abstract void write(String message);
	
}
