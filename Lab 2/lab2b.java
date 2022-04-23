import java.util.Scanner;
import java.lang.Math;

public class lab2b {
    public static void main(String[] args)
    {
        double maxNumber1 = Math.max(22.3, 34.5);
        double minNumber1 = Math.min(3.6/7.2, 3.8/6.9);
        double maxNumber2 = Math.max(2/3, 0.1);
        double minNumber2 = Math.min(13.5555, 13.5556);

        // expected is 34.5
        System.out.println(maxNumber1);
        // expected is 0.5 -> 3.6/7.2
        System.out.println(minNumber1);
        // expected is 2/3
        System.out.println(maxNumber2);
        // expected is 13.5555
        System.out.println(minNumber2);

        String enterName;
        double num1, num2, num3;


        Scanner name = new Scanner (System.in);
        System.out.println("Please enter your name followed by three numbers (space seperated):  \n");
        enterName = name.next();
        num1 = name.nextDouble();
        num2 = name.nextDouble();
        num3 = name.nextDouble();
        
        double maxNum1 = Math.max(Math.max(num1,num2),num3);
        double maxNum2 = Math.max(Math.min(num1,num2),num3);
        double minNum = Math.min(Math.min(num1,num2),num3);

        System.out.println("Hello, " + enterName + ". Here are the numbers you entered in descending order: " + maxNum1 + " " + maxNum2 + " " + minNum);
    }
        
}
