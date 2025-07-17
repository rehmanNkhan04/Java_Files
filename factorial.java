import java.util.*;
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number's factorial you want: ");
        int n = sc.nextInt();
        int i = 1;
        int facto = 1 ;
        while (i <= n) {
            facto = i * facto;
            i++;      
        } 
        System.out.println("Factorial is = " + facto);
        sc.close();
    }
}
