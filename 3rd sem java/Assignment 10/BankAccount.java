public class BankAccount {
    int accno;
    String accname;
    double initialbalance;

    public BankAccount(int no, String name, double balance) {
        this.accno = no;
        this.accname = name;
        this.initialbalance = balance;
    }

    void deposit(double amount) {
        initialbalance += amount;
        System.out.println("Deposited: " + amount + ", New balance: " + initialbalance);
    }

    void withdraw(double amount) {
        if(amount < initialbalance) {
            initialbalance -= amount;
            System.out.println("Withdrawn: " + amount + ", New balance: " + initialbalance);
        }
        else {
            System.out.println("Insufficient balance.");
        }
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int no, String name, double balance) {
        super(no, name, balance);
    }

    void withdraw(double amount) {
        if(initialbalance - amount < 100) {
            System.out.println("Cannot withdraw: Balance would be below 100");
        }
        else {
            super.withdraw(amount);
        }
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(123456, "R. K. Singh", 150);
        sa.deposit(50);
        sa.withdraw(50);
        sa.withdraw(90);
    }
}