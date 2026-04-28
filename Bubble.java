import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {

        int[] arr ={-3,-8,1,9,4};
        int size = arr.length;
        int temp;
        System.out.println("without sorting" + Arrays.toString(arr));

        for (int i = 0; i <size-1 ; i++) {
                boolean swapped = false; // reset on every pass
            // inner loop size-i-1 checks if largest element is already in last no need to comapare and sort them
            //again
            for (int j = 0; j <size-i-1 ; j++) {

                if(arr[j]>arr[j+1]){
                    temp  = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swapped =true;
                }

            }
            if(!swapped){break;
            }
            System.out.println(Arrays.toString(arr));
        }

        System.out.println("after sorting "+Arrays.toString(arr));

    }
}
