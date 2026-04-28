import java.util.ArrayList;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer>list = new ArrayList<>();
        System.out.println("enter the size");
        int size = in.nextInt();


        for (int i = 0; i <size; i++) {

            int num = in.nextInt();
            list.add(num);

        }


        System.out.println(list);
        list.set(0,34);
        System.out.println("this is updated array list"+list);

    }
}
