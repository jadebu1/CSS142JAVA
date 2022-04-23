public class h1p1 {
    public static double bmiOne(double m, double h) 
    {
        return m/(h*h);
    }
    //bmiTwo method implementation
    public static double bmiTwo(double w, double h)
    {
        return 703.0 * w /(h*h);
    }
    //bmiPrinter method implementation
    public static void bmiPrinter (double bMI)
    {
        System.out.print("Your BMI is " + bMI + " Please refer to the table below to check the category for this value");
        System.out.println();
        System.out.println("---------------------------------------");
        System.out.println("|  From   |   To   |   BMI Category   |");
        System.out.println("|---------|--------|------------------|");
        System.out.println("|  16.0   |  18.5  |    Underweight   |");
        System.out.println("|  18.5   |  25.0  |      Normal      |");
        System.out.println("|  25.0   |  30.0  |    Overweight    |");
        System.out.println("|  30.0   |  35.0  | Moderately Obese |");
        System.out.println("|  35.0   |  40.0  |  Severely Obese  |");
        System.out.println("---------------------------------------");
    }
// main function definition
    public static void main (String [] args) 
    {
        //test for bmiOne method
        double bmi1 = bmiOne(50,1.6);
        double bmi2 = bmiOne(60,1.9);
        double bmi3 = bmiOne(90,5.7);
        double bmi4 = bmiOne(80,2.3);
        double bmi5 = bmiOne(120,3.4);
        //test for bmiTwo method
        double bmi6 = bmiTwo(120, 60);
        double bmi7 = bmiTwo(150, 75);
        double bmi8 = bmiTwo(200, 80);
        double bmi9 = bmiTwo(170, 60);
        double bmi10 = bmiTwo(180,70);
        //print of test methods
        bmiPrinter(bmi1);
        bmiPrinter(bmi2);
        bmiPrinter(bmi3);
        bmiPrinter(bmi4);
        bmiPrinter(bmi5);
        bmiPrinter(bmi6);
        bmiPrinter(bmi7);
        bmiPrinter(bmi8);
        bmiPrinter(bmi9);
        bmiPrinter(bmi10);
    }
}
