import java.util.Stack;

public class stack {
    public static void main(String[] args) {

        Stack<Integer>stack = new Stack<>();

            stack.push(10);
            stack.push(23);
            stack.push(9);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
