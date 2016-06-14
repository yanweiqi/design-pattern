package behavioral.command.first;

import org.junit.Test;

import com.behavioral.command.first.Command;
import com.behavioral.command.first.Invoker;
import com.behavioral.command.first.Receiver;
import com.behavioral.command.first.impl.ConcreteCommand;


public class CommandTest {

	@Test
	public void testCall(){		
		Receiver receiver = new Receiver();
		Command cmd = new ConcreteCommand(receiver);
		Invoker invoker = new Invoker();
		invoker.storeCommand(cmd);
		invoker.execute();
		String  b = "true";
		System.out.println(Boolean.parseBoolean(b));
	}
	
}
