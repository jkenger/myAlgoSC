import java.util.Queue;
import java.util.Stack;
import java.util.Scanner;
import java.util.LinkedList;
public class Book {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userInput;
        Stack bookStack = new Stack();
        Queue bookQue = new LinkedList();
        for(int i = 1; i <= 4; i++)
        {
            System.out.println("Book " + i + ": ");
            userInput = input.nextLine();
            bookStack.push(userInput);
        }
        int bookSize = bookStack.size();
        for(int i = 0; i < bookSize; i++)
        {   
            System.out.println("Press P to get a book");
            userInput = input.nextLine();
            if(!bookStack.isEmpty())
            { 
                if(userInput.equalsIgnoreCase("P"))
                { 
                    bookQue.offer(bookStack.pop());
                }else
                {
                    System.out.println("Invalid input.");
                    i--;
                }
            }
        }
        
        System.out.println("New order of books:");
        System.out.println(bookQue);
    }
    
}
