import java.util.Scanner;

public class SubarrayK {
    public static void main(String []args){

        // scanner input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i = 0; i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
            int k = sc.nextInt();
        // answer

        System.out.println( maxSubarraySum(arr,k));

    }

    //function , solution of the problem

    public static int maxSubarraySum(int[] arr, int k) {
        int i =0;
        int j =0;
        int size = arr.length;

        int sum =0;
        int maxsum = Integer.MIN_VALUE;

        while(j<size){

            sum += arr[j];

            // window size less than k
            if(j - i + 1 < k){

                j++;
            }

            // window size exactly k
            else if(j - i + 1 == k){

                maxsum = Math.max(maxsum, sum);

                sum -= arr[i];

                i++;
                j++;
            }
        }
        return maxsum;
    }

}
