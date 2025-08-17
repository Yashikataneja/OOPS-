class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    BankAccount(int num, String holder, double b) {
        accountNumber = num;
        accountHolder = holder;
        balance = b;
    }
    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (amt <= balance)
            balance -= amt;
        else
            System.out.println("Insufficient balance!");
    }
}
class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int num, String holder, double b, double rate) {
        super(num, holder, b);
        interestRate = rate;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance() + ", Interest Rate: " + interestRate + "%");
    }

    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, "Priya", 5000, 4.5);
        sa.displayDetails();
        sa.deposit(2000);
        sa.displayDetails();
    }
}

