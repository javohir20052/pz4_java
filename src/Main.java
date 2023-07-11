import java.util.Iterator;
import java.util.LinkedList;

public class  Main {
    public static void main(String[] args){
        MyQueue queue = new MyQueue();
        queue.enqueue("1");
        queue.enqueue("2");
        queue.enqueue("3");
        System.out.println(queue.size);
        System.out.println(queue.first());
        System.out.println(queue.dequeue());
        System.out.println(queue.first());
    }
}

