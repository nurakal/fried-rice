/**
* @author Nura Kalmurzaeva
* Software Design and Documentation
* Week 4 Project
*/
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Collections;

/**
* This class reads a list of Integer numbers from the scan
* input and saves them into a Linked List sorted from the smallest to the largest
*/
public class ProjectWeek4{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers will you input?");
        int userInput = sc.nextInt();

        LinkedList<Integer> myLL = new LinkedList<Integer>();
        for (int i = 0; i < userInput; i++ ){
            System.out.println("Enter your numbers: ");
            int temp = sc.nextInt();
            myLL.add(temp);
            }
    sc.close();
    Collections.sort(myLL);
    System.out.println("Sorted array: " + myLL);
    }
}