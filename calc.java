import java.util.*;
public class calc {
    static double addition(double a, double b){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numarical values to add");
        a = sc.nextInt(); b = sc.nextInt();
        double sum = a + b;
        System.out.println(sum);
        return sum;
    }
    static double subtraction(double c, double d){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numarical values to subtract");
        c = sc.nextInt(); d = sc.nextInt();
        double sub = c - d;
        System.out.println(sub);
        return sub;
    }
    static double multiplication(double e, double f){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numarical values to multiply");
        e = sc.nextInt(); f = sc.nextInt();
        double multiply = e * f;
        System.out.println(multiply);
        return multiply;
    }
    static double division(double x, double y){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numarical values to divide");
        x = sc.nextInt(); y = sc.nextInt();
        double divide = x / y;
        System.out.println(divide);
        return divide;
    }
    public static void main(String[] args) {
        addition(0, 0);
        subtraction(0, 0);
        multiplication(0, 0);
        division(0, 0);
    }
}
