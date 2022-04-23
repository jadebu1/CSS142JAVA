import java.util.Scanner;
public class H1P2 
{
     //Main method
   public static void main(String args[]) 
   {
      
    //Scanner class object
    Scanner reader = new Scanner(System.in);
   
    //define integers
    int cents;
    int dollars;
    int quarters;
    int dimes;
    int nickels;
    int totalCents;
   
    //Reading amount in cents
    System.out.print("\n Enter amount (in cents): ");
    totalCents = reader.nextInt();
   
    //Printing result
    change(totalCents);
   
    //Reading individual values
    System.out.print("\n\n Enter money (in dollars): ");
    dollars = reader.nextInt();
    System.out.print("\n\n Enter money (in quarters): ");
    quarters = reader.nextInt();
    System.out.print("\n\n Enter money (in dimes): ");
    dimes = reader.nextInt();
    System.out.print("\n\n Enter money (in nickels): ");
    nickels = reader.nextInt();
    System.out.print("\n\n Enter money (in cents): ");
    cents = reader.nextInt();
   
    //Printing in total cents
    inCents(dollars, quarters, dimes, nickels, cents);
    }

//Change method
public static void change(int totalCents) 
{
    int dollars;
    int quarters;
    int dimes;
    int nickels;
    int cents;
   
    //Finding cents
    cents = totalCents;
   
    // Finding dollars
     dollars = cents/100;
   
    //Remaining cents
    cents = cents % 100;

     // Finding quarters
     quarters = cents / 25;

     // Finding cents
     cents = cents % 25;

     // Finding dimes
     dimes = cents / 10;

     // Finding cents
     cents = cents % 10;

     // Finding nickels
     nickels = cents / 5;

     // Finding cents
     cents = cents % 5;
   
    //Printing result
    System.out.printf("\n %d cents corresponds to: %d dollars, %d quarters, %d dimes, %d nickels and %d cents. \n", totalCents, dollars, quarters, dimes, nickels, cents);
}

//Method that adds to total cents
public static void inCents(int dollars, int quarters, int dimes, int nickels, int cents) 
{
    int totalCents;
   
    //Calculating total cents
    totalCents = (dollars * 100) + (quarters * 25) + (dimes * 10) + (nickels * 5) + cents;
   
    //Printing result
    System.out.printf("\n %d dollars, %d quarters, %d dimes, %d nickels and %d cents corresponds to: %d cents. \n", dollars, quarters, dimes, nickels, cents, totalCents);
}

}