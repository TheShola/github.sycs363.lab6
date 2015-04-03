package lab5test;
import static org.junit.Assert.assertEquals;
import lab5.IntegerArrayList;

import org.junit.Test;


/**
 * @author shola
 *
 */
public class Add2_test {

	@Test
	public void test() {
		
		//Integer Array List is tested
		IntegerArrayList tester = new IntegerArrayList();
		tester.add(12,5);
	
		//Tests
		assertEquals("Should be 12", 12, tester.get(5));
		//fail("Not yet implemented");
	}

}