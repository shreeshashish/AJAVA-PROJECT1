import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("1. Add Customer");
            System.out.println("2. Add Product");
            System.out.println("3. Place Order");
            System.out.println("4. Count Products");
            System.out.println("5. Show Product Names");
            System.out.println("6. Count Customers Ordered");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int ch = sc.nextInt();

            try {

                switch (ch) {

                    case 1:
                        System.out.print("Customer ID: ");
                        int cid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Name: ");
                        String name = sc.nextLine();

                        System.out.print("Mail: ");
                        String mail = sc.nextLine();

                        customer.addCustomer(cid, name, mail);
                        break;

                    case 2:
                        System.out.print("Product ID: ");
                        int pid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Name: ");
                        String pname = sc.nextLine();

                        System.out.print("Price: ");
                        int price = sc.nextInt();

                        product.addProduct(pid, pname, price);
                        break;

                    case 3:
                        System.out.print("Order ID: ");
                        int oid = sc.nextInt();

                        System.out.print("Customer ID: ");
                        cid = sc.nextInt();

                        System.out.print("Product ID: ");
                        pid = sc.nextInt();

                        System.out.print("Quantity: ");
                        int quantity = sc.nextInt();

                        order.addOrder(oid, cid, pid, quantity);
                        break;

                    case 4:
                        order.countProduct();
                        break;

                    case 5:
                        order.showProductsName();
                        break;

                    case 6:
                        order.countCustomerOrders();
                        break;

                    case 7:
                        System.out.println("Thank you!");
                        System.exit(0);

                    default:
                        System.out.println(
                          "Invalid choice!");
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}