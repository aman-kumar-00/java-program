import java.util.*;

public class RemoveDuplicate {
    public static void main(String[] args) {
        // creating scanner

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int []arr = new int[n];

        // taking input
        for(int i =0;i<n;i++){

            arr[i] = sc.nextInt();
        }

        // solution of problem

        ArrayList<Integer>list = new ArrayList<>();
        HashSet<Integer>set = new HashSet<>();

        for(int i =0;i<arr.length;i++){

            if(!set.contains(arr[i])){

                set.add(arr[i]);
                list.add(arr[i]);
            }
        }

        //ans print

        for(int i =0; i<list.size();i++){

            System.out.print(list.get(i)+" ");
        }

    }
}
