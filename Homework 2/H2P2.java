import java.util.Scanner;

public class H2P2 

public static void main(String[] args) 
    {   
    Scanner sc = new Scanner(System.in);
    Scanner scName = new Scanner(System.in);
    System.out.print("Please enter the full name : ");
    String name = scName.nextLine();
    
    double hourWork,basePay;
    System.out.print("Enter base pay : ");
    basePay = sc.nextDouble();
    
    System.out.print("Enter hours worked in a week : ");
    hourWork = sc.nextDouble();
    double payment = salaryTotal(basePay,hourWork);
    
    if(payment==-1)
    {
    System.out.println("The base salary you entered does not comply with state law");
    }
    else if(payment==-2)
    {
    System.out.println("The number of hours your entered does not comply with company policy");
    }
    else
    {
    System.out.println("The total pay for is $"+payment+" dollars");
    }
    sc.close();
    scName.close();
    }
    static double salaryTotal (double basePay,double hourInWeek)
        {
        if(basePay<5.25)
        {
        return -1;
        }
        else if(hourInWeek>60)
        {
        return -2;
        }
        else
        {
            if(hourInWeek<=40)
            {
            return hourInWeek*basePay;
            }
            else
            {
            double extraHours = hourInWeek - 40;
            return (40*basePay + extraHours*basePay*1.5);
            }
        }
    }  
}
        