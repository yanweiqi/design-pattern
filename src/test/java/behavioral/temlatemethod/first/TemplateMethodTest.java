package behavioral.temlatemethod.first;

import org.junit.Test;

import com.behavioral.templatemethod.first.Cricket;
import com.behavioral.templatemethod.first.Football;
import com.behavioral.templatemethod.first.Game;

public class TemplateMethodTest {
	
	@Test
	public void testCall(){		
	      Game game = new Cricket();
	      game.play();
	      System.out.println();
	      game = new Football();
	      game.play();
	}
}
