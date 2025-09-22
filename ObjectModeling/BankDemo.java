class Bank {
    String bankName;

    Bank(String name) {
        this.bankName = name;
    }

    void openAccount(Customer c) {
        System.out.println(c.name + " opened an account in " + bankName);
    }
}

class Customer {
    String name;
    double balance;

    Customer(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void viewBalance() {
        System.out.println(name + "'s Balance: " + balance);
    }
}

public class BankDemo {
    public static void main(String[] args) {
        Bank b1 = new Bank("SBI");
        Customer c1 = new Customer("Ramesh", 5000);

        b1.openAccount(c1);
        c1.viewBalance();
    }
}
