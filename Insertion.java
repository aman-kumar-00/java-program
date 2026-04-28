import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {

        int[] arr ={8,3,5,2,1};
        int size = arr.length;

        System.out.println("without sorting" + Arrays.toString(arr));

        for (int i =1; i <size ; i++) {

            int temp = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>temp){

                arr[j+1]= arr[j];
                j--;
            }
            arr[j+1] = temp;

            System.out.println(Arrays.toString(arr));

        }

        System.out.println("sorted "+Arrays.toString(arr));
    }
}
