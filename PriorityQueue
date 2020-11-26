import java.util.Scanner;
import java.util.PriorityQueue;

public class Greeting {

    public static void main(String[] args) {
        //Create priority queue and scanner object named nicknames and userInput.
        PriorityQueue nicknames = new PriorityQueue();
        Scanner userInput = new Scanner(System.in);
        
        //Ask the user to enter a nickname 4 times.
        System.out.println("Enter the nicknames of 4 of your classmates: ");
        for(int i = 0; i < 4; i++)
        {
            nicknames.add(userInput.nextLine());
        }
        
        //Ask the user to hi.
        System.out.println("Press H to say Hi to each of them.");
        while(!nicknames.isEmpty())
        {
            String userinp = userInput.nextLine();
            if(userinp.equalsIgnoreCase("H"))
            {
                System.out.println("Hi " + nicknames.remove());
            }
        }
        System.out.println("Done saying Hi.");
    }
    
}
