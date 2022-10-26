public class Main {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("Gil", 100);
        System.out.println(myAccount);
        myAccount.deposit(10);
        System.out.println(myAccount);
        myAccount.withdraw(20);
        System.out.println(myAccount);

        Point myPoint = new Point(5,5);
        Point origin = new Point();
        System.out.println(myPoint);
        System.out.println(origin);
    }
}
