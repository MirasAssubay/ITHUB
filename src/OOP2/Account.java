package OOP2;

public class Account {
    private int ID;
    private Customer customer;
    private double balance = 0.0;

    public Account(int ID, Customer customer) {
        this.ID = ID;
        this.customer = customer;
    }

    public Account(int ID, Customer customer, double balance) {
        this.ID = ID;
        this.customer = customer;
        this.balance = balance;
    }

    public int getID() {
        return ID;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customer.getName();
    }

    public Account deposit(double amount) {
        balance += amount;
        return this;
    }

    public Account withdraw(double amount) {
        if (balance >= amount){
            balance -= amount;
        }
        else System.out.println("Amount withdraw exceeds the current balance!");
        return this;
    }

    @Override
    public String toString() {
        return "Account{" +
                "ID=" + ID +
                ", customer=" + customer +
                ", balance=" + balance +
                '}';
    }
}
