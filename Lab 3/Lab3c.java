import java.util.Random;
import java.util.Scanner;


public class Lab3c {
	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		Random ran = new Random();
		int comp = ran.nextInt(3);
                System.out.println("Select \n0 rock \n1 paper \n2 scissors");
		System.out.println("Enter 0 or 1 or 2");
		int user = userInput.nextInt();
		System.out.println("You selected " + inToWord(user));
		System.out.println("The computer selected " + inToWordcomp(comp));
		System.out.println("the result is " + findWinner(user, comp));
		

		/* added an inToWord swtich for the computer
		* added a println for the user choice
		* added a println for comp choice with switch case
		* added a println for the result with a call to findWinner */

	}

	public static String inToWord(int user)
	{
		switch(user)
		{
			case 0:
				return "rock";
			case 1:
				return "paper";
			case 2:
				return "scissors";
			default:
				return "Select 0-2";
		}
	}
	public static String inToWordcomp(int comp)
	{
		switch(comp)
		{
			case 0:
				return "rock";
			case 1:
				return "paper";
			case 2:
				return "scissors";
			default:
				return "Select 0-2";
		}
	}
	public static String findWinner(int user, int comp)
	{
		if (user == comp)
		{
			return "tie";
		}
		else if (user == 0 && comp == 2)
		{
			return inToWord(user) + " beats " + inToWord(comp) + " you win";
		}
		else if (user == 1 & comp == 0)
		{
			return inToWord(user) + " beats " + inToWord(comp) + " you win";
		}
		else if (user == 2 && comp == 1)
		{
			return inToWord(user) + " beats " + inToWord(comp) + " you win";
		}
		else 
		{
			return inToWord(comp) + "beats" + inToWord(user) + "I win";
		}
		
	}
	
}
