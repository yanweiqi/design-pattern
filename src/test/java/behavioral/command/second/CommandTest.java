package behavioral.command.second;

import org.junit.Test;

import com.behavioral.command.second.Command;
import com.behavioral.command.second.CommandReflect;


public class CommandTest {

	@Test
	public void testCall(){		
		
		CommandReflect commandReflect = new CommandReflect(1);
		Command command = new Command(commandReflect, "addOne", new Integer[]{3});
		System.out.print(command.execute() + " ");
	}
	
}
