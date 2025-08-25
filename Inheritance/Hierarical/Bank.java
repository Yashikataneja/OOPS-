class BankAccount {
    int accountNumber;
    double balance;

    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(int accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("This is a Savings Account.");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(int accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("This is a Checking Account.");
        displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int durationInMonths;

    FixedDepositAccount(int accountNumber, double balance, int durationInMonths) {
        super(accountNumber, balance);
        this.durationInMonths = durationInMonths;
    }

    void displayAccountType() {
        System.out.println("This is a Fixed Deposit Account.");
        displayDetails();
        System.out.println("Duration: " + durationInMonths + " months");
    }
}

public class Bank{
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(1001, 5000.0, 4.5);
        CheckingAccount ca = new CheckingAccount(1002, 3000.0, 1000.0);
        FixedDepositAccount fda = new FixedDepositAccount(1003, 10000.0, 12);

        sa.displayAccountType();
        System.out.println("-------------------------");
        ca.displayAccountType();
        System.out.println("-------------------------");
        fda.displayAccountType();
    }
}
