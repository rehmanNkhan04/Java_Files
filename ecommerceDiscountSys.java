import java.util.*;
public class ecommerceDiscountSys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prices of the items: ");
        double prices = sc.nextDouble(), total = 0;
        while (prices > 0) {
            total += prices;
            prices = sc.nextDouble();
        }
        int discount;
        if (total > 500) {
            discount = 1;
        } else if (total >= 200 && total <= 499 ) {
            discount = 2;
        } 
        else {
            discount = 3;
        }
        double finalprices; 
        switch (discount) {
            case 1:
                finalprices = total * 0.8;
                System.out.println("You recieved a 20% discount");
                break;
            case 2:
                finalprices = total * 0.9;
                System.out.println("You recieved a 10% discount");
                break;
            default:
                finalprices = total;
                System.out.println("No discount applied");
                break;
        }
        System.out.println("Total bill: " + total);
        System.out.println("Final price: " + finalprices);
        sc.close();
    }
}