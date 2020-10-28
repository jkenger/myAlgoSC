import java.util.Stack;
import java.util.Scanner;
public class FruitBasket {

    public static void main(String[] args) {
        // TODO code application logic here
        String userFruit;
        int userFruitCount;
        
        Scanner scan = new Scanner(System.in);
        Stack basket = new Stack();
        
        //Ask the user to enter a fruit
        System.out.println("Catch and eat any of these fruits: "
                + "\n'Apple' "
                + "\n'Orange' "
                + "\n'Guava' "
                + "\n'Mango'");
        //
        
        //Ask how many fruit would the user to catch.
        System.out.println("Btw how many fruits would you like to catch? ");
        userFruitCount = scan.nextInt();
        //
        
        //Ask the user to choose in any of those fruit. Repeat if the user input is Invalid.
        System.out.println("Choose a fruit to catch. \nPress [A] - 'Apple',"
                + "\n[O] - 'Orange',"
                + "\n[G] - 'Guava',"
                + "\n[M] - 'Mango'\n");
        //
        
        //Add the user input to the stack.
        for(int i = 1; i <= userFruitCount; i++)
        {
            System.out.println("Fruit " + i + " of " + userFruitCount);
            userFruit = scan.next();
            if(userFruit.equalsIgnoreCase("A"))
            {
                basket.push("Apple");
            }else if(userFruit.equalsIgnoreCase("O"))
            {
                basket.push("Orange");
            }else if(userFruit.equalsIgnoreCase("G"))
            {
                basket.push("Guava");
            }else if(userFruit.equalsIgnoreCase("M"))
            {
                basket.push("Mango");
            }else
            {
                System.out.println("Invalid input.");
                i -= 1;
            }
        }
        //
        
        //Display
        System.out.println("\nYour basket nwo has: " + basket);
        //
        
        //Remove each element.
        for(int i = 0; i < userFruitCount; i++)
        {
            System.out.println("Press [E] to eat a fruit.");
            String userOpt = scan.next();
                if(userOpt.equalsIgnoreCase("E"))
                {
                    basket.pop();
                    if(!basket.isEmpty())
                    {  
                        System.out.println("\nFruiot(s) in the basket: " + basket);
                    }else
                    {
                        System.out.println("\nNo more fruits");
                    }
                }else
                {
                    System.out.println("Invalid input.");
                    i -= 1;
                }
                
        }
        
    }
    
}
