import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
public class MovieTime {

    public static void main(String[] args) {
        String userResponse;
        Queue movies = new LinkedList();
        Queue snacks = new LinkedList();
        
        Scanner userInput = new Scanner(System.in);
        
        for(int i = 1; i <= 3; i++)
        {
            System.out.println("Enter movie " + i + " of " + 3);
            userResponse = userInput.nextLine();
            movies.offer(userResponse);
        }
        
        for (int i = 1; i <= 3; i++)
        {
            System.out.println("Enter snacks " + i + " of " + 3);
            userResponse = userInput.nextLine();
            snacks.offer(userResponse);
        }
        System.out.println("Movies to watch are: deque(" + movies + ")");
        System.out.println("Snacks available are: deque(" + snacks + ")\n");
        
        while(!snacks.isEmpty())a
        {
           System.out.println("Press S each time you finish a snack.");
            userResponse = userInput.nextLine();
            if(userResponse.equalsIgnoreCase("S"))
            {
                snacks.poll();
                if(snacks.isEmpty())
                {  
                    System.out.println("No more snacks");
                }else
                {
                    System.out.println("Snacks available are: deque(" + snacks + ")\n");
                }
                
            }else
            {
                System.out.println("Invalid input.");
            }
        }
            
        
    }
    
}
