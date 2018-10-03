import org.junit.*;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

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

	@Test
    public void testRegression() {
        assertEquals(MyMathLibrary.average(0, 0), 0);
        assertEquals(MyMathLibrary.average(0, 1), 0);
        assertEquals(MyMathLibrary.average(0, 2), 1);
        assertEquals(MyMathLibrary.average(0, 3), 1);
        assertEquals(MyMathLibrary.average(0, 4), 2);
        assertEquals(MyMathLibrary.average(0, 5), 2);
        assertEquals(MyMathLibrary.average(0, 6), 3);
        assertEquals(MyMathLibrary.average(0, 7), 3);
        assertEquals(MyMathLibrary.average(0, 8), 4);
        assertEquals(MyMathLibrary.average(0, 9), 4);
        assertEquals(MyMathLibrary.average(1, 0), 0);
        assertEquals(MyMathLibrary.average(1, 1), 1);
        assertEquals(MyMathLibrary.average(1, 2), 1);
        assertEquals(MyMathLibrary.average(1, 3), 2);
        assertEquals(MyMathLibrary.average(1, 4), 2);
        assertEquals(MyMathLibrary.average(1, 5), 3);
        assertEquals(MyMathLibrary.average(1, 6), 3);
        assertEquals(MyMathLibrary.average(1, 7), 4);
        assertEquals(MyMathLibrary.average(1, 8), 4);
        assertEquals(MyMathLibrary.average(1, 9), 5);
        assertEquals(MyMathLibrary.average(2, 0), 1);
        assertEquals(MyMathLibrary.average(2, 1), 1);
        assertEquals(MyMathLibrary.average(2, 2), 2);
        assertEquals(MyMathLibrary.average(2, 3), 2);
        assertEquals(MyMathLibrary.average(2, 4), 3);
        assertEquals(MyMathLibrary.average(2, 5), 3);
        assertEquals(MyMathLibrary.average(2, 6), 4);
        assertEquals(MyMathLibrary.average(2, 7), 4);
        assertEquals(MyMathLibrary.average(2, 8), 5);
        assertEquals(MyMathLibrary.average(2, 9), 5);
        assertEquals(MyMathLibrary.average(3, 0), 1);
        assertEquals(MyMathLibrary.average(3, 1), 2);
        assertEquals(MyMathLibrary.average(3, 2), 2);
        assertEquals(MyMathLibrary.average(3, 3), 3);
        assertEquals(MyMathLibrary.average(3, 4), 3);
        assertEquals(MyMathLibrary.average(3, 5), 4);
        assertEquals(MyMathLibrary.average(3, 6), 4);
        assertEquals(MyMathLibrary.average(3, 7), 5);
        assertEquals(MyMathLibrary.average(3, 8), 5);
        assertEquals(MyMathLibrary.average(3, 9), 6);
        assertEquals(MyMathLibrary.average(4, 0), 2);
        assertEquals(MyMathLibrary.average(4, 1), 2);
        assertEquals(MyMathLibrary.average(4, 2), 3);
        assertEquals(MyMathLibrary.average(4, 3), 3);
        assertEquals(MyMathLibrary.average(4, 4), 4);
        assertEquals(MyMathLibrary.average(4, 5), 4);
        assertEquals(MyMathLibrary.average(4, 6), 5);
        assertEquals(MyMathLibrary.average(4, 7), 5);
        assertEquals(MyMathLibrary.average(4, 8), 6);
        assertEquals(MyMathLibrary.average(4, 9), 6);
        assertEquals(MyMathLibrary.average(5, 0), 2);
        assertEquals(MyMathLibrary.average(5, 1), 3);
        assertEquals(MyMathLibrary.average(5, 2), 3);
        assertEquals(MyMathLibrary.average(5, 3), 4);
        assertEquals(MyMathLibrary.average(5, 4), 4);
        assertEquals(MyMathLibrary.average(5, 5), 5);
        assertEquals(MyMathLibrary.average(5, 6), 5);
        assertEquals(MyMathLibrary.average(5, 7), 6);
        assertEquals(MyMathLibrary.average(5, 8), 6);
        assertEquals(MyMathLibrary.average(5, 9), 7);
        assertEquals(MyMathLibrary.average(6, 0), 3);
        assertEquals(MyMathLibrary.average(6, 1), 3);
        assertEquals(MyMathLibrary.average(6, 2), 4);
        assertEquals(MyMathLibrary.average(6, 3), 4);
        assertEquals(MyMathLibrary.average(6, 4), 5);
        assertEquals(MyMathLibrary.average(6, 5), 5);
        assertEquals(MyMathLibrary.average(6, 6), 6);
        assertEquals(MyMathLibrary.average(6, 7), 6);
        assertEquals(MyMathLibrary.average(6, 8), 7);
        assertEquals(MyMathLibrary.average(6, 9), 7);
        assertEquals(MyMathLibrary.average(7, 0), 3);
        assertEquals(MyMathLibrary.average(7, 1), 4);
        assertEquals(MyMathLibrary.average(7, 2), 4);
        assertEquals(MyMathLibrary.average(7, 3), 5);
        assertEquals(MyMathLibrary.average(7, 4), 5);
        assertEquals(MyMathLibrary.average(7, 5), 6);
        assertEquals(MyMathLibrary.average(7, 6), 6);
        assertEquals(MyMathLibrary.average(7, 7), 7);
        assertEquals(MyMathLibrary.average(7, 8), 7);
        assertEquals(MyMathLibrary.average(7, 9), 8);
        assertEquals(MyMathLibrary.average(8, 0), 4);
        assertEquals(MyMathLibrary.average(8, 1), 4);
        assertEquals(MyMathLibrary.average(8, 2), 5);
        assertEquals(MyMathLibrary.average(8, 3), 5);
        assertEquals(MyMathLibrary.average(8, 4), 6);
        assertEquals(MyMathLibrary.average(8, 5), 6);
        assertEquals(MyMathLibrary.average(8, 6), 7);
        assertEquals(MyMathLibrary.average(8, 7), 7);
        assertEquals(MyMathLibrary.average(8, 8), 8);
        assertEquals(MyMathLibrary.average(8, 9), 8);
        assertEquals(MyMathLibrary.average(9, 0), 4);
        assertEquals(MyMathLibrary.average(9, 1), 5);
        assertEquals(MyMathLibrary.average(9, 2), 5);
        assertEquals(MyMathLibrary.average(9, 3), 6);
        assertEquals(MyMathLibrary.average(9, 4), 6);
        assertEquals(MyMathLibrary.average(9, 5), 7);
        assertEquals(MyMathLibrary.average(9, 6), 7);
        assertEquals(MyMathLibrary.average(9, 7), 8);
        assertEquals(MyMathLibrary.average(9, 8), 8);
        assertEquals(MyMathLibrary.average(9, 9), 9);

    }
	
	
}
