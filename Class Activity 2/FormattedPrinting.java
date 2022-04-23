import java.util.*;
/**
 * Demo source code for printf used to format screen output.
 * Display theses numbers based on the sample output provided.
 * @version v1.4/11/2019
 */
public class FormattedPrinting {
    public static void main(String[] args) {
        //A cat store - intro to format specifiers (see slides from lecture 3)
        String storeName = "CatCo";
        
        int numberOfCats = 53;
        double mostExpensiveCat = 234.5689;
        double leastExpensiveCat = 51.5674;
        double averageCatCost = 115.2345;
        String welcomeMes = "Welcome to " + storeName + " the home of " + numberOfCats + " cats!";
        
        
        System.out.println("---------------------------------------------------------");
        System.out.println(welcomeMes);
        System.out.println();
        System.out.printf("Our most expensive cat is: %26.2f dollars\n", mostExpensiveCat);
        System.out.printf("Our least expensive cat is: %25.2f dollars\n", leastExpensiveCat);
        System.out.printf("On average you can go home with a cat for: %10.2f dollars\n", averageCatCost);
        System.out.println("---------------------------------------------------------");

       
        
        double bobAccount = 1345.6324;    //print this value as left justified
        double joeAccount = -643.2340;    //print this value as right justified
        double aliceAccount = 134000000;  //print this value using scientific notation
        double eveAccount1 = -5.6789;     //print as displyed in the smaple output
        double eveAccount2 = 3.6789;

        System.out.printf("Bob\'s balance left justified: $%-21.2f (note spaces after the number)\n", bobAccount);
        System.out.printf("Joe\'s balance is negative (with parentheses): $%(14.2f)\n", joeAccount);
        System.out.printf("Alice\'s balance is so huge so lets use scientific notation: $%15.2e\n", aliceAccount);
        System.out.printf("Eve has 2 accounts. Account 1: %-5.2f.", eveAccount1);
        System.out.printf(" Account 2: %-5.2f.", eveAccount2);
    }
}
