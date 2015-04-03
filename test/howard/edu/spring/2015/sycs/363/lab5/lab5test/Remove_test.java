package lab5test;
import static org.junit.Assert.assertEquals;
import lab5.IntegerArrayList;

import org.junit.Test;

public class Remove_test {

	@Test
	public void test() {
		IntegerArrayList tester = new IntegerArrayList();
		int removed_value = tester.remove(0);
		
		//Tests
		assertEquals("Should return -1", -1, tester.indexOf(removed_value));
		//fail("Not yet implemented");
	}

}