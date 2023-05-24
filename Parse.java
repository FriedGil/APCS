public class Parse {
    public static void main(String[] args){
        Queue<Integer> q = new Queue<Integer>();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);
        q.enqueue(5);
        System.out.println(q.front());
        System.out.println(q.back());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.dequeue());
        System.out.println(q.front());
        System.out.println(q.back());

    }

}
    
class Queue <T> {
    private T[] contents;
    private int length;
    private int front;
    private int back;
    public Queue(int n){
        contents = (T[]) new Object[n];
        length = n;
        int front = 0;
        int back = 0;
    }
    public Queue(){
        contents = (T[]) new Object[10];
        length = 10;
    }
    public void enqueue(T n){
        if (back >= length){
            T[] temp = contents;
            length *= 2;
            contents = (T[]) new Object[length];
            for (int i = 0; i < contents.length; i++){
                contents[i] = temp[i];
            }
        }
        contents[back] = n;
        back+=1;
    }
    public T front(){
        return contents[front];
    }

    public T back(){
        return contents[back-1];
    }

    public T dequeue(){
        front++;
        return contents[front-1];

    }
}
