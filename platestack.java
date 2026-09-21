import java.util.Stack;

public class platestack {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(10);
        s.push(70);
        s.push(34);

        System.out.println(s);

        s.pop();

        System.out.println(s);


    }
}
