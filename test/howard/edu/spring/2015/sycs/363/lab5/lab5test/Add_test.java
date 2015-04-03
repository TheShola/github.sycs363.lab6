package lab5test;
import static org.junit.Assert.assertEquals;
import lab5.IntegerArrayList;

import org.junit.Test;

/**
 * @author shola
 *
 */
public class Add_test {

	@Test
	public void test() {
		
		//IntegerArray List is tested
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(10);
		
		//Tests
		assertEquals("Should return 10", 10, tester.get(0));
		//fail("Not yet implemented");
	}

}