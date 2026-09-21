import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeBasic {
    public static void main(String[] args) {

        Deque<Integer> dq = new ArrayDeque<>();

        dq.offer(24);
        dq.offer(56);

        dq.offerFirst(1);
        dq.offerLast(59);

        System.out.println(dq);



    }
}
