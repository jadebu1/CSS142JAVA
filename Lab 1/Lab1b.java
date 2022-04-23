public class Lab1b 
{

     public static void main (String[] args) 
     {
        int numBottles; // number of bottles currently on the wall

        // display first verse
        numBottles = 5;
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        --numBottles;
        System.out.print(numBottles);
        onWall();
        System.out.println();  // display blank line between verses
        
        numBottles = 4;
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        --numBottles;
        System.out.print(numBottles);
        onWall();
        System.out.println(); 
        
        numBottles = 3;
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        takeOneDown();
        --numBottles;
        System.out.print(numBottles);
        onWall();
        System.out.println(); 
        
        numBottles = 2;
        System.out.print(numBottles);
        onWall();
        System.out.print(numBottles);
        botBeer();
        shouldFall();
        --numBottles;
        System.out.print(numBottles);
        onWall();
        System.out.println(); 
        
        numBottles = 1;
        System.out.print(numBottles);
        onWalls();
        System.out.print(numBottles);
        botBeers();
        takeOneDown();
        noMore();

        // display second verse
        // [this is where you take over]
     }

     public static void onWall() 
     {
        System.out.println(" bottles of beer on the wall");
     }
     
     public static void onWalls() 
     {
        System.out.println(" bottle of beer on the wall");
     }
     
     public static void botBeers() 
     {
        System.out.println(" bottle of beer");
     }

     public static void botBeer() 
     {
        System.out.println(" bottles of beer");
     }
     
     public static void takeOneDown()
     {
         System.out.println("Take one down and pass it around");
        }
        
     public static void shouldFall()
     {
            System.out.println("If one of those bottles should happen to fall");
        }
    
     public static void noMore()
     {
         System.out.println("No more bottles of beer on the wall");
        }
     }
  
  