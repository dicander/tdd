

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathLibraryTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAverage() {
		assertEquals(MyMathLibrary.average(1, 1), 1);
	}
	
	@Test
	public void testRoundingDown() {
		assertEquals(MyMathLibrary.average(1, 2), 1);
	}
	
	@Test
	public void testMaxMax() {
		assertEquals(MyMathLibrary.average(Integer.MAX_VALUE, Integer.MAX_VALUE), Integer.MAX_VALUE);
	}
	
	@Test
	public void testMinMin() {
		try {
			MyMathLibrary.average(Integer.MIN_VALUE, Integer.MIN_VALUE);
		} catch (ArithmeticException e) {
			return;
		} catch (Exception e) {
			fail();
		}
		fail();
	}
	
	
	@Test
	public void testHighLow() {
		assertEquals(MyMathLibrary.average(10, 2), 6);
	}
	
	@Test
	public void testLowFirst34() {
		assertEquals(MyMathLibrary.average(3, 4), 3);
	}
	
	@Test
	public void testHighFirst43() {
		assertEquals(MyMathLibrary.average(4, 3), 3);
	}
	
	
	@Test
	public void testNegRound() {
		try {
			MyMathLibrary.average(-3,-4);
		} catch (ArithmeticException e) {
			return;
		} catch (Exception e) {
			fail();
		}
		fail();
	}
	
	@Test
	public void testLowHigh() {
		assertEquals(MyMathLibrary.average(2, 10), 6);
	}
	
	@Test
	public void testMinMax() {
		try {
			MyMathLibrary.average(Integer.MAX_VALUE, Integer.MIN_VALUE);
		} catch (ArithmeticException e) {
			return;
		} catch (Exception e) {
			fail();
		}
		fail();
	}
	
	@Test
	public void testMaxMin() {
		try {
			MyMathLibrary.average(Integer.MAX_VALUE, Integer.MIN_VALUE);
		} catch (ArithmeticException e) {
			return;
		} catch (Exception e) {
			fail();
		}
		fail();
		
	}
	
	
}
