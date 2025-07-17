import java.util.*;
public class bankingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 0.0;
        boolean running = true;
        while (running) {
            System.out.println("Choose an option:");
            System.out.println("1. Deposit money");
            System.out.println("2. Withdraw money");
            System.out.println("3. Check balance");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Enter an amount to deposit: ");
                    double deposit = sc.nextDouble();
                    balance += deposit;
                    System.out.println("Deposit successful. New balance:" + balance);
                    break;
                case 2:
                    System.out.println("Enter an amount to withdraw: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw>balance) {
                        System.out.println("Insufficient funds! Withdrawal failed");
                    } else {
                        balance -= withdraw;
                        System.out.println("Withdrawal successful. Remaining balance:" + balance);
                    }
                    break;
                case 3:
                    System.out.println("Your account balance is " + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the banking system!");
                    running = false;
                    break;
                default:
                System.out.println("Invalid choice. Try again!");
                    break;
            }
        }
        sc.close();
    }
}
