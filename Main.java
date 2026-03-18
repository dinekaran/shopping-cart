import model.Product;
import service.CartService;
import util.BillUtil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CartService service = new CartService();

        int choice;

        do {
            System.out.println("\n--- Shopping Cart System ---");
            System.out.println("1. Add Product");
            System.out.println("2. View Cart");
            System.out.println("3. Checkout");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Product ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Product Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Price: ");
                    double price = sc.nextDouble();

                    service.addProduct(new Product(id, name, price));
                    break;

                case 2:
                    service.viewCart();
                    break;

                case 3:
                    double total = service.calculateTotal();
                    BillUtil.printBill(total);
                    break;

                case 4:
                    System.out.println("Exiting Shopping Cart...");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);
    }
}
