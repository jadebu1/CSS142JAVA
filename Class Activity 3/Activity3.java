import java.util.Scanner;

    public class Activity3 
    {
            public static void main(String [] args) 
            {
                //Problem 1
                Scanner keyboard1 = new Scanner(System.in);
                System.out.println("Enter a whole number: ");
                System.out.println("Enter another whole number: ");
                int numOne = keyboard1.nextInt();
                int numTwo = keyboard1.nextInt();
                int sum = numOne + numTwo;
                int dif = numOne - numTwo;
                int prod = numOne * numTwo;
                System.out.println(numOne + "," + numTwo);
                System.out.println("The sum is: " + sum);
                System.out.println("The difference is: " + dif);
                System.out.println("The product is: " + prod);

                //Problem 2
                System.out.println("Type a word: ");
                String text1;
                text1 = keyboard1.next();
                System.out.println(text1);
                System.out.printf(text1.toUpperCase());
                System.out.printf(text1.toLowerCase());

                //problem 3
                Scanner keyboard = new Scanner(System.in);
                System.out.println();
                System.out.println("Enter your age.");
                int age = keyboard.nextInt();
                System.out.println(age);
                System.out.println("Enter your name.");
                String rid = keyboard.nextLine();
                String name = keyboard.nextLine();
                System.out.println(name);
                System.out.println(name + ", you are " + age + " years old.");
                
                /* Problems fixed
                 does not echo input
                 added blank nextLine call to omit /n from previous input */

                 //Problem 4
                 keyboard.useDelimiter(", ");

                 //Problem 5
                 String word1 = keyboard.next();
                 String word2 = keyboard.next();

                 /* word1 = one,two three
                 word2 = four
                 'five' will be omitted or would be classed as word3 if the string was defined */
            }
    
    }
