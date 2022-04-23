import java.util.Scanner;
import java.lang.Math;

public class ButlerJade_HW_Branching 
{
    public static void main(String[] args)
    {    
        // initiate scanner + prompt to enter scores
        Scanner scoreScanner = new Scanner(System.in);
        System.out.println("Please enter three scores (time in seconds)");
        // declare score variables
        double scoreOne =  getScore(scoreScanner,  "Enter score 1: ");
        double scoreTwo = getScore(scoreScanner, "Enter score 2: ");
        double scoreThree = getScore(scoreScanner, "Enter score 3: ");
        // sort scores
        double[] rankedScores = rankScores(scoreOne, scoreTwo, scoreThree);
        // dump return values
        System.out.println(shareScore(rankedScores));
        System.out.printf("The range of race times (in seconds) is: %.2f", range(rankedScores));
        System.out.printf("\nThe average time of all racers (in seconds) is: %.2f", average(rankedScores));
    }

    public static double getScore(Scanner input, String prompt) 
    {
        // collect computer input for scores
        System.out.println(prompt);
        double result = input.nextDouble();
        System.out.println("You entered: " + result);
        return result;
    }

    public static double[] rankScores (double scoreOne, double scoreTwo, double scoreThree)
    {
        // this should be the return value from computation
        // array for ease of organization
        // define array
        double [] Scores = new double [3];
        
        // rank scores
        Scores[2] = Math.max(Math.max(scoreOne,scoreTwo),scoreThree);
        Scores[1] = Math.max(Math.min(scoreOne,scoreTwo),scoreThree);
        Scores[0] = Math.min(Math.min(scoreOne,scoreTwo),scoreThree);
        // print score ranking
        System.out.println("First place (time in seconds): " + Scores[0]);
        System.out.println("Second place (time in seconds): " + Scores[1]);
        System.out.println("Third place (time in seconds): " + Scores[2]);

        return Scores;
    }

    public static String shareScore (double [] Scores)
    {
        // determine if ties are present
        if (Scores[0] == Scores[1] && Scores[0] == Scores[2])
            return "All racers tied.";
        else if (Scores[0] == Scores[1])
            return "Two racers are tied for first";
        else if  (Scores[1] == Scores[2])
            return "Two racers shared second place";
        return "None are tied";
    }

    public static double average (double [] Scores)
    {
        // calculate average of scores
        double avg = (Scores [0] + Scores [1] + Scores [2]) / 3;
        return avg;
    }

    public static double range (double [] Scores)
    {
        // calculate range of scores
        double range = Scores [2] - Scores [0];
        double rangeAbs = Math.abs(range);
        return rangeAbs;
    }

}
