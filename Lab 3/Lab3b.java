

public class Lab3b {
	public static void main(String[] args) {
		part3();
		
		System.out.println("\nTesting greaterOfTwo:");
		System.out.println(greaterOfTwo(-3, 6.2));
	

		// smallestOfThree tests
		
		System.out.println("\nTesting smallestOfThree:");
		System.out.println(smallestOfThree(3, 17, 8));

	}
	public static void part3() 
	{
		boolean isFiveLess = 5 < 15;
		int n = 4;
		boolean isEven = ( n % 2 == 0 );
		boolean isOdd = ! ( isEven );
		boolean isTenLessOrEqual = ( 10 <= 100/10 );
		int a = 3;
		int b = 5;
		boolean isALess = a < b;

		System.out.println(isFiveLess);
		System.out.println(isEven);
		System.out.println(isOdd);
		System.out.println(isTenLessOrEqual);
		System.out.println(isALess);
	}

	public static double greaterOfTwo(double x, double y)
	{
		if(x > y)
			return x;
		else
			return y;
	}

	public static double smallestOfThree(double a, double b, double c)
	{
		if(a < b && a < c)
			return a;
		else if(b > c)
			return b;
		else
			return c;
	}
}
