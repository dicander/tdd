

public class MyMathLibrary {
	
	/**
	 * Returns the average of two positive integers rounded down.
	 * @param a the lower of the two integers
	 * @param b the higher of the two integers
	 * @return the average of two integers rounded down
	 * @throws ArithmeticException if any input is negative
	 */
	public static int average(int a, int b) {
		return 42;
	}
	
	/**
	 * Returns the average of two positive integers rounded down.
	 * @param a the lower of the two integers
	 * @param b the higher of the two integers
	 * @return the average of two integers rounded down
	 * @throws ArithmeticException if any input is negative
	 */
	public static int average1(int a, int b) {
		return (a+b)/2;
	}
	
	/**
	 * Returns the average of two positive integers rounded down.
	 * @param a the lower of the two integers
	 * @param b the higher of the two integers
	 * @return the average of two integers rounded down
	 * @throws ArithmeticException if any input is negative
	 */
	public static int average2(int a, int b) {
		return a+(b-a)/2;
	}
	
	/**
	 * Returns the average of two positive integers rounded down.
	 * @param a the lower of the two integers
	 * @param b the higher of the two integers
	 * @return the average of two integers rounded down
	 * @throws ArithmeticException if anything is negative
	 */
	public static int average3(int a, int b) {
		if(a<0 || b<0) {
			throw new ArithmeticException("Expected positive numbers, got "+a+" and "+ b +".");
		}
		return a+(b-a)/2;
	}
	
	/**
	 * Returns the average of two positive integers rounded down.
	 * @param a the lower of the two integers
	 * @param b the higher of the two integers
	 * @return the average of two integers rounded down
	 * @throws ArithmeticException if anything is negative
	 */
	public static int average4(int a, int b) {
		if(a<0 || b<0) {
			throw new ArithmeticException("Expected positive numbers, got "+a+" and "+ b +".");
		}
		return (a+b)>>>1;
	}

	public static void main(String[] args) {
		for(int i=0; i<10; ++i) {
			for(int j=0; j<10; ++j) {
				System.out.print("assertEquals(MyMathLibrary.average("+i+", "+j+"), "+average(i,j)+");");
				System.out.println();
			}
		}
	}
}
