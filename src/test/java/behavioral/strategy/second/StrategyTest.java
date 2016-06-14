package behavioral.strategy.second;

import org.junit.Test;

import com.behavioral.strategy.second.Context;
import com.behavioral.strategy.second.impl.OperationAdd;
import com.behavioral.strategy.second.impl.OperationMultiply;
import com.behavioral.strategy.second.impl.OperationSubstract;

public class StrategyTest {
	
	@Test
	public void testCall(){		

	      Context context = new Context(new OperationAdd());		
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationSubstract());		
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	      context = new Context(new OperationMultiply());		
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
