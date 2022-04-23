public class Activity4 {
    public static void main(String [] args)
    {
        
     int testGrade = 72;      
 
     if (testGrade < 60)
     {
         System.out.println("Need more work!");
     }
         else if (testGrade <= 69)
         {
             System.out.println("You are on the right track");
         } 
     else
     {
         if (testGrade >= 90 )
         {
             System.out.println("Perfect!");
         }
         else if (testGrade >= 80 )
         {
             System.out.println("Excellent");
         } 
         else if (testGrade >= 70 )
         {
             System.out.println("Very Good.");
         }
    }

    int age =  75;

    if (age < 65)
    {
        if (age < 19)
        {
            if (age <13)
            {
                System.out.println("You are still a child");
            }
            else
            {
                System.out.println("Your are now a teenager");
            }
        }
        else 
        {
            System.out.println("You are an adult");
        }
    }
    else
    {
        System.out.println("You are a senior citizen");
    }
    }
}
