public class SinglyLinkedList<E> {
    private Node<E> head;
    private int size;
    public SinglyLinkedList() {
        head = null;
        size = 0;
    }


    public boolean isEmpty() {
        return head == null;
    }


    public void add(E d) {
        if(isEmpty()) {
            head = new Node<E>(d, null);
        } else {
            Node<E> temp = head;
            while(temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(new Node<E>(d, null));
        }
        size++;
    }

    public void add(int index, E value){

        Node<E> temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.getNext();
        }
        head = new Node<E>(value, temp);    

    }
    public int size()
    {
        return size;
    }
    public void clear()
    {
        head = null;
        size = 0;
    }
    public E get(int index){
        Node<E> temp = head;
        for (int i = 0; i < index; i++){
            temp = temp.getNext();
        }
        return temp.getData();
    }

    public int indexOf(E value){
        Node<E> temp = head;
        if (temp.getData().equals(value)) return 0;
        for (int i = 1; i < size; i++){
            temp = temp.getNext();
            if (temp.getData().equals(value)) return i;
        }
        return -1;
    }


    public E set (int index, E value){
        Node<E> temp = head;
        E val = null;
        for (int i = 0; i < index; i++){
            temp = temp.getNext();
        }
        val = temp.getData();
        temp.setData(value);
        return val;
    }

    public String toString(){
        String res = "[";
        for (int i = 0; i < size; i++){
            res += get(i) + "," ;
        }
        res = res.substring(0, res.length()-1) + "]";
        return res;
    }


}




class Node<E> {
    private E data;
    private Node<E> next;

    public Node(E d, Node<E> n) {
        data = d;
        next = n;
    }

    public E getData() {
        return data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setData(E d) {
        data = d;
    }

    public void setNext(Node<E> n) {
        next = n;
    }

    

}