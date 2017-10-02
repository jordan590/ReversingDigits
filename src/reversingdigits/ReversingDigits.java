/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reversingdigits;

import java.util.Scanner;

/**
 *
 * @author joklu7045
 */
public class ReversingDigits {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int userNum;
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number you would like to reverse: ");
        userNum = input.nextInt();
        reverseNum(userNum);

    }

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
