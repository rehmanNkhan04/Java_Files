import java.util.*;
public class employeePayrollSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter employee's name: ");
        String name = sc.nextLine();
        
        System.out.println("Enter job role(Manager, Developer, Intern): ");
        String role = sc.nextLine();
        
        System.out.println("Enter hours worked");
        int hours = sc.nextInt();
        
        double wage = 0;
        
        switch (role) {
            case "Manager":
                wage = 50;
                break;
            
            case "Developer":
                wage = 35;
                break;
        
            case "Intern":
                wage = 15;
                break;
    
            default:
                System.out.println("Entered wrong input. Try again");
                break;              
        }
        double total;
        if (hours > 40) {
            int overtime = hours - 40;
            total = (40 * wage) + (overtime * wage * 1.5);
        } else {
            total = hours * wage;
        }
        System.out.println("--- payroll summary---");
        System.out.println("Employee name: " + name);
        System.out.println("Job role: " + role);
        System.out.println("Hours worked: " + hours);
        System.out.println("Hourly wage of " + wage);
        System.out.println("Total salary is: " + total);
        sc.close();
    }
}
