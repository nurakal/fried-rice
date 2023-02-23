
/**
 * Nura Kalmurzaeva
 * Software Design and Documentation
 * Week 5 - project
 */
import java.util.Scanner;
import java.util.Stack;


/**
 * This class reads a list of Integer numbers from the scan
 * input and saves them into a Stack sorted from the smallest to the largest
 */
public class ProjectWeek5{

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will you input?");
        int userInput = sc.nextInt();
        Stack<Integer> myStack = new Stack<>();
        Stack<Integer> tempStack = new Stack<>();
        for (int i = 0; i < userInput; i++ ){
            System.out.println("Enter your numbers: ");
            int temp = sc.nextInt();
            if (myStack.empty()){
                myStack.push(temp);
            }
            else {
                while (true){
                    if (!myStack.empty() && myStack.peek() > temp){
                        tempStack.push(myStack.pop());
                    }
                    else{
                        myStack.push(temp);
                        if (!tempStack.empty()){                      
                            while (!tempStack.empty()){
                                myStack.push(tempStack.pop());
                            }
                        }
                        break;
                    }
                }
            }
        }
        sc.close();
        System.out.println("Sorted stack: " + myStack);        
    }
}