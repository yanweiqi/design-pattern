package behavioral.visitor.first;

import org.junit.Test;

import com.behavioral.visitor.first.ComputerPart;
import com.behavioral.visitor.first.impl.Computer;
import com.behavioral.visitor.first.impl.ComputerPartDisplayVisitor;

public class VisitorTest {
	
	@Test
	public void testCall(){		
	   ComputerPart computer = new Computer();
	   computer.accept(new ComputerPartDisplayVisitor());
	}
}
