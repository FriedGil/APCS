public class BankAccount {
    private String name;
    private int balance;
    public BankAccount(String n, int a){
        this.name = n;
        this.balance = a;
    }
    public String getName(){
        return name;
    }

    public int getBalance(){
        return balance;
    }

    public String toString(){
        return(name + " has $" + balance);
    }
}
