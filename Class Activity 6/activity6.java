import java.util.Scanner;

public class activity6 {
    public static void main(String[] args)
    {
        //Problem 1
        double sumL2R = 0;
        double sumR2L = 0;
        double n = 50000;
        double dif = sumL2R - sumR2L;
      
    
        for(double i = 1; i <= n; i++)
        {
            sumL2R += (double) 1/i;
        }

        for(double i = n; i >= 1; i--)
        {
            sumR2L += (double) 1/i;
        }

        int k = 123456789; 
        int m = 0;  
 
        while (k != 0) 
        { 
        m =(10  *  m) + (k % 10); 
        k = k /10; 
        } 
 

        System.out.printf("Left-to-right harmonic sum %.15f", sumL2R);
        System.out.println();

        System.out.printf("Right-to-left harmonic sum %.15f", sumR2L);
        System.out.printf("HarmonicSumDifference = %.15f", dif);
    }
        //Problem 2
        public static void doWhileLoop()
        {
            Scanner keyboard = new Scanner(System.in);
            int a = 6;
            int b = 9;
            char choice = 'y';
            do
            {
                int c = a*b;
                System.out.println(c);
                System.out.println("Does" + a + "*" + b + "=" + c + "?");
                System.out.println("Type in \"Yes/no\"");
                String input = keyboard.next();
                choice = input.charAt(0);
            }
            while (choice == 'y' || choice == 'Y');
        }

        //Problem 3
        /* the while(count = 0) should be a boolean expression
        * so it should read while(count==0) so the computer 
        * can evaluate the boolean expression rather than the integer
        * in this case, a mathematical operator is used */

        /* Problem 4
        * the loop will only run 1->9 rather 
        * than 1->10 so the count will be off by one */

        /* Problem 5
        * code produces this output
        *1
        *1
        *2
        *3
        *5
        *8
        *13
        *21
        *34
        *55
        *89
        *144
        *233
        *377
        *610
        *54 */     
        
        /* Problem 6
        * m = 987654321
        *n = 0 */
}
