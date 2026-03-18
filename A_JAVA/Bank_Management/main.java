import java.sql.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        user user = new user();
        bank bank = new bank();
        account account = new account();

        while (true) {

            System.out.println("1. Add New User");
            System.out.println("2. Add New Bank");
            System.out.println("3. Create Account");
            System.out.println("4. Deposit Amount");
            System.out.println("5. Withdraw Amount");
            System.out.println("6. Search Account Details");
            System.out.println("7. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter User ID: ");
                    int uid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String uname = sc.nextLine();

                    System.out.print("Enter DOB: ");
                    String dob = sc.next();

                    System.out.print("Enter Aadhar: ");
                    String aadhar = sc.next();

                    System.out.print("Enter PAN: ");
                    String pan = sc.next();

                    User user = new User();
                    user.setUid(uid);
                    user.setUname(uname);
                    user.setDob(Date.valueOf(dob));
                    user.setAadhar(aadhar);
                    user.setPan(pan);

                    user.addUser(user);
                    break;
                case 2:
                    System.out.print("Enter Bank ID: ");
                    int bid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Bank Name: ");
                    String bname = sc.nextLine();

                    System.out.print("Enter Branch: ");
                    String branch = sc.nextLine();

                    System.out.print("Enter IFSC: ");
                    String ifsc = sc.next();

                    Bank bank = new Bank();
                    bank.setBid(bid);
                    bank.setBname(bname);
                    bank.setBranch(branch);
                    bank.setIfsc(ifsc);

                    bank.addBank(bank);
                    break;
                case 3:
                    System.out.print("Enter Account Number: ");
                    String accNo = sc.next();

                    System.out.print("Enter Initial Balance: ");
                    double bal = sc.nextDouble();

                    System.out.print("Enter User ID: ");
                    int uId = sc.nextInt();

                    System.out.print("Enter Bank ID: ");
                    int bid = sc.nextInt();

                    accountDAO.createAccount(accNo, bal, uId, bid);
                    break;
                case 4:
                    System.out.print("Enter Account Number: ");
                    accno = sc.next();

                    System.out.print("Enter Amount to Deposit: ");
                    double dep = sc.nextDouble();

                    accountDAO.deposit(accno, dep);
                    break;
                case 5:
                    System.out.print("Enter Account Number: ");
                    accno = sc.next();

                    System.out.print("Enter Amount to Withdraw: ");
                    double w = sc.nextDouble();

                    accountDAO.withdraw(accno, w);
                    break;
                case 6:
                    System.out.print("Enter Account Number: ");
                    accno = sc.next();

                    AccountDetails details =account.getAccountDetails(accno);

                    if (details == null) {
                        System.out.println("Account Not Found!");
                    } 
                    else {
                        System.out.println("Account No: " + details.getaccno());
                        System.out.println("Balance: ₹" + details.getbalance());

                        System.out.println("Name: " + details.getUserName());
                        System.out.println("Aadhar: " + details.getAadhar());
                        System.out.println("PAN: " + details.getPan());

                        System.out.println("Bank: " + details.getBankName());
                        System.out.println("Branch: " + details.getBranch());
                        System.out.println("IFSC: " + details.getIfsc());
                    }
                    break;
                case 7:
                    System.out.println("Thank you for using Bank Management System!");
                    System.exit(0);
                default:
                    System.out.println("Invalid Choice! Try again.");
            }
        }
    }
}