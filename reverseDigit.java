import java.util.*;
public class reverseDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // prompt the user for a number
        System.out.println("Enter any number: ");
        int num = sc.nextInt();
        // variable to store the int value
        int reversedNum = 0;
        //while loop to reverse the digits
        while (num > 0) {
            int digit = num % 10; // to extract the last digit 
            reversedNum = reversedNum * 10 + digit; // add it to the reversed number
            num = num / 10; //remove the last digit 
        }
        // restore the sign if the original number was negitive

        System.out.println("The reversed number is: " + reversedNum);

        sc.close();
    }
}
