import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean moreCustomers = true;

        while (moreCustomers) {
            int totalAmount = 0;
            int n;

            System.out.println("\n Welcome to Online Shopping Cart ");

          
            do {
                System.out.print("Enter number of items you want to buy (minimum 1 item to buy): ");
                n = sc.nextInt();
            } while (n < 1);

          
            for (int i = 1; i <= n; i++) {
                System.out.println("\nSelect product from the menu:");
                System.out.println("Enetr 1 for SmartPhone (₹25000)");
                System.out.println("Enter 2 Laptop (₹40000)");
                System.out.println("enter 3 SmartWatch (₹2000)");
                System.out.println("enter 4  Book (₹500)");
                System.out.print("Enter your choice: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        totalAmount += 25000;
                        break;
                    case 2:
                        totalAmount += 40000;
                        break;
                    case 3:
                        totalAmount += 2000;
                        break;
                    case 4:
                        totalAmount += 500;
                        break;
                    default:
                        System.out.println("Invalid choice! No item added.");
                }
            }

          
            if (totalAmount > 5000) {
                System.out.println("\nYou are eligible for 10% discount!");
                totalAmount = totalAmount - (totalAmount * 10 / 100);
            }

            System.out.println("Final Bill Amount: ₹" + totalAmount);

            
            System.out.print("\nIs there another customer? (yes=1 / no=0): ");
            int next = sc.nextInt();
            if (next == 0) {
                moreCustomers = false;
            }
        }

        System.out.println("\nThank you for shopping with us!");
        sc.close();
    }
}