import java.util.*;
public class bmi {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter your weight in kg: ");
      
        float  w = sc.nextFloat();
      
        System.out.println("Enter your height in meters: ");
      
        float h = sc.nextFloat();
      
        float bmi = w/ h;
      
        if (bmi < 18.5) {
            System.out.println("You're underweight");
        } 
        else {
            System.out.println("You're normal weight");
        }
        
        sc.close();
    }
}
