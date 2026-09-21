import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class list {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        ArrayList<Integer>list = new ArrayList<>();
        ArrayList<Integer>list2 = new ArrayList<>();

        System.out.println("enter the size");
        int size = in.nextInt();


        for (int i = 0; i <size; i++) {

            int num = in.nextInt();
            list.add(num);


        }

        list2.add(20);
        list2.add(203);
        list2.add(205);

        list.addAll(list2);




        System.out.println(list);
        //list.set(0,34);
        System.out.println("this is updated array list"+list);

        Collections.sort(list);

        System.out.println("sorted array list "+list);

    }
}
