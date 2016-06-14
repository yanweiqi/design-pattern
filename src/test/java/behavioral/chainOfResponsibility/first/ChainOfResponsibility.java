package behavioral.chainOfResponsibility.first;

import org.junit.Test;
import com.behavioral.ChainOfResponsibility.first.AbstractLogger;
import com.behavioral.ChainOfResponsibility.first.ConsoleLogger;
import com.behavioral.ChainOfResponsibility.first.ErrorLogger;
import com.behavioral.ChainOfResponsibility.first.FileLogger;

public class ChainOfResponsibility {

	@Test
	public void testCall(){		
      AbstractLogger loggerChain = getChainOfLoggers();
      loggerChain.logMessage(AbstractLogger.INFO,  "This is an information.");
      
      //loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
      //loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}

   private static AbstractLogger getChainOfLoggers(){

	   /**
	    * ����һ������ error��next��file��file��next��console
	    * 
	    */
	   
      AbstractLogger errorLogger   = new ErrorLogger(AbstractLogger.ERROR);
      AbstractLogger fileLogger    = new FileLogger(AbstractLogger.DEBUG);
      AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

      errorLogger.setNextLogger(fileLogger);
      fileLogger.setNextLogger(consoleLogger);

      return fileLogger;	
   }
}
