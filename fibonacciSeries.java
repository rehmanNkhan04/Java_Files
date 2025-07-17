import java.util.*;
public class fibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many terms of the fibonacci series do you want desplayed: "); //promt input from the user
        int n = sc.nextInt();
        int first = 0; int second = 1;
        System.out.println("The fibonacci sequence is: " + first + ", " + second); // printing the first 2 terms
        for (int i = 2; i < n; i++) {  // loop starts from 2 since we already have the first 2 terms in the sequence
            int next = first + second; // for the next value after the first and second
            System.out.println(next); // printing the values after those
            first = second; // value of the second goes to first
            second = next;           // value of the nth/next goes to second
        }
        sc.close();
    }
}
