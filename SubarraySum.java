// brute force
import java.util.*;
public class SubarraySum {
    public static void main(String []args){

        //input

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];

        for (int i = 0; i <n ; i++) {

            arr[i] = sc.nextInt();
        }
            // ans

        System.out.println(sum(arr));

        }

        //optimize approach



        // function brute force approach
        static int sum(int[]arr){

            int total =0;
            for (int i = 0; i <arr.length ; i++) {
                int sum = 0;

                for (int j = i; j <arr.length ; j++) {

                    sum += arr[j];

                    total += sum;

                }

            }

            return total;
        }

    }
