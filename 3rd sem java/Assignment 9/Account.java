public class Account {
    String accountNumber;
    float balance;

    public Account(String accountNumber, float balance) {
        if (accountNumber == null || accountNumber.isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty.");
        }
        else {
            this.accountNumber = accountNumber;
        }

        if (balance < 0.0f) {
            System.out.println("Error: Balance cannot be negative.");
        }
        else {
            this.balance = balance;
        }

        if (accountNumber == "" || accountNumber == null || balance < 0.0f) {
            System.out.println("----------");
        }
        else {
            display();
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("---------");
    }
    public static void main(String[] args) {
        Account a1 = new Account("ACC12345", 5000.75f);
        Account a2 = new Account("SBI008", 1000);
        Account a3 = new Account("ACC67890", -2000);
        Account a4 = new Account(null, -500);
    }
}