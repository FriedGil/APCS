public class BankAccount {

    private String name;
    private int balance;

    public BankAccount(String n, int b) {
        this.name = n;
        this.balance = b;
    }

    public BankAccount() {
        this.name = "Unknown";
        this.balance = 0;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public String toString() {
        return (name + " has $" + balance);
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}