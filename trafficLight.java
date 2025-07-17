import java.util.*;
public class trafficLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter either red, yellow, or green: ");
        String light = sc.nextLine();
        switch (light) {
            case "red":
                System.out.println("Stop");
                break;

            case "yellow":
                System.out.println("Ready to move");
                break;
            
            case "green":
                System.out.println("Go!");
                break;
        
            default:
                System.out.println("Invalid input. Retry");
                break;
        }
        sc.close();
    }
    
}
