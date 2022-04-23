import java.util.Scanner;

public class Lab2a 
{
    public static void main(String[] args)
    {
        
        System.out.println("Enter a temperature in Fahrenheit:");
        Scanner fH = new Scanner(System.in);
        double F1 = fH.nextDouble();
        System.out.println("You entered " + F1 + " degrees");
        
        System.out.println("\nTesting kelvins and temperaturePrinter:");
        temperaturePrinter(F1, kelvins(F1));
     
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input total seconds as an integer");
        int totalSeconds = sc.nextInt();
        System.out.println("You entered " + totalSeconds + " seconds");
                    
        secondTime(totalSeconds);

        int hr = 15;
        int sec = 500;
        int min = 450;

        inSeconds(hr, min, sec);
    }
    public static double kelvins(double F1) 
    {
        double k = (5/9)*(F1 - 32) + 273.15;
        return k;
    }
   
    public static void temperaturePrinter(double F1, double k) 
    {
       System.out.println(F1 + " deg. F equals " + k + " deg K");
    }
   
    public static void secondTime(int totalSeconds)
    {
        int seconds = totalSeconds % 60;
        int totalMinutes = totalSeconds / 60;
        int minutes = totalMinutes % 60;
        int hours = totalMinutes / 60;

        System.out.println( totalSeconds + " seconds corresponds to:");
        System.out.println( hours + " hours " + minutes + " minutes " + seconds + " seconds, or " + totalSeconds + " seconds");   
    }
    public static void inSeconds (int hr, int min, int sec) 
    {
        int totalMin = (hr * 60) + min;
        int totalSec = (totalMin * 60) + sec;
        System.out.println( hr + ":" + min + ":" + sec + " == " + totalSec + " seconds.");
        
    }
}
