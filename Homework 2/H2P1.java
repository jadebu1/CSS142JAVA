import java.util.Scanner;
public class H2P1 {

{
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);
        
        double a, b, c;
        double x, y;
        
        // reading a, b and c values from the user
        
        System.out.println("Enter the a, b, and c of your quadratic function: ");
        
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        
        // calculating x and y values
        
        x = -b / (2 * a);
        y = a * (x * x) + b * x + c;
        
        // based on the vertex and a value displaying the facts to user
        
        System.out.println("The vertex of the corresponding parabola is: ("+ x + "," + y + ")");

        if(x == 0 && y == 0)
        {
        System.out.println("This vertex is also the zero of your parabola");
        System.out.println("This vertex is also the y-intercept of your parabola");
        }
        else if(a > 1)
        {
        System.out.println("the graph opens upwards and the vertex is a minimum")
        }
        else if(a < 1)
        {
        System.out.println("the graph opens downwards and the vertex is a maximum");
        }
     }
}

}
