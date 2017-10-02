package reversingdigits;
import java.util.Scanner;
/**
 * Jordan Klug
 * October 2nd, 2017
 * Objective: The application will serve the purpose to accept a number, reverse it and repeat it back to the user
 */
public class ReversingDigits {
    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userNum;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number you would like to reverse: ");
        userNum = input.nextInt();
        reverseNum(userNum);
    }
    /**
     * This method is called by the main method to accept the users chosen number
     * and reverse it, then prints the answer directly to the output console.
     * 
     * @param input 
     */
    public static void reverseNum (int input) {
        int reversedNum = 0;
        int userNum = input;
        while (userNum != 0){
            reversedNum = reversedNum *10 + userNum % 10;
            userNum = userNum / 10;
        }
        System.out.println("Your reversed number is: " + (int) reversedNum);
    }
}
