import java.util.ArrayDeque;
import java.util.Queue;

public class DequeueJava {
    public static void main(String[] args) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        q.add(10);
        q.offer(20);
        System.out.println(q);
        q.offerFirst(30);
        q.offerLast(70);
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.pollLast());
        System.out.println(q);
        System.out.println("Peek First: "+q.peekFirst());
        System.out.println("Peek Last : "+q.peekLast());
    }
}
