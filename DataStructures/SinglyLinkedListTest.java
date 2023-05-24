    public class SinglyLinkedListTest{

    public static void main(String[] args)

    {

        SinglyLinkedList<String> l = new SinglyLinkedList<String>();

        l.add("A");
        l.add("B");
        l.add("C");
        l.add("C");

        l.add("C");

        l.add(2,"E");
        System.out.println(l);               //should print [B,A,B,C]

    }

}