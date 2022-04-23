import java.util.Scanner;
public class Lab3a 
{
	public static void main(String[] args) 
	{
		System.out.println("\nTesting oddEvenChecker:");
		int n;
		System.out.println(oddEvenChecker(3));
		System.out.println(oddEvenChecker(8));
	
		System.out.println("\nTesting multipleOfChecker:");
		int x, y;
		System.out.println(multipleOfChecker(16, 4));
		System.out.println(multipleOfChecker(11, 3));

		System.out.println("\nTesting sqrtSumBucketer:");
		System.out.println(sqrtSumBucketer(sum));

		/* I fixed the multipleOf and the oddEven
		* checkers as well as the return values 
		* but I still cannot find a way to print
		* the return values of the sqrtbucketer */
	}
		static String oddEvenChecker (int n)
		{
		if(n%2 == 0)
			return n + " is an even number";
		else 
			return n + " is  an odd number";
		}
		static String multipleOfChecker (int x, int y)
        	{
        		if(x%y == 0)
        			return x + " is a multiple of " + y;
        		else 
        			return x + " is not a multiple of " + y;
        	}
        	
		static String sqrtSumBucketer(Scanner in)
		{
        		double x, y;
        		Scanner input = new Scanner(System.in);
        		System.out.println("Enter two doubles: ");
        		x = in.nextDouble();
        		y = in.nextDouble();
        		double sum = Math.sqrt(x) + Math.sqrt(y);
        		if(sum < 10)
        			return "Less than 10";
        		else if(sum >=10 && sum < 20)
                		return "Between 10 and 20";
        		else if(sum >= 20 && sum < 30)
                		return "Between 20 and 30";
        		else 
                		return "Greater than 20";
		}
}