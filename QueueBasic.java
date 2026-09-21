import java.util.LinkedList;
import java.util.Queue;

public class QueueBasic {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        // in add if task unsuccesful throw exeception
        q.add(23);
        q.add(24);
        q.add(25);

        // in offer it show false if taskd if its unsucessfull
        q.offer(34);


        System.out.println(q);

        // peek se front element dek sakte hai
        System.out.println(q.peek());
        // poll se peek and remove
        System.out.println(q.poll());
        System.out.println(q);

    }
}
