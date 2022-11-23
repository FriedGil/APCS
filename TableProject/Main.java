package TableProject;

public class Main {
    public static void main(String[] args){
    Table t = new Table("TableProject\\test.csv",3);
    t.appendToAll(5);
    t.printFormatted();
    System.out.println(t.getRowByName("c2").contains(3));
    }
}
