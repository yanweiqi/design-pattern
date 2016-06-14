package behavioral.Iterator.second;

import org.junit.Test;

import com.behavioral.iterator.second.Iterator;
import com.behavioral.iterator.second.impl.NameRepository;

public class IteratorTest {
	@Test
	public void testCall(){		
       NameRepository nameRepository = new NameRepository();
       Iterator<String> it = nameRepository.getIterator();
       while (it.hasNext()) {
           String name =(String) it.next();
           System.out.println("Name : " + name);
       }
		
	}
}
