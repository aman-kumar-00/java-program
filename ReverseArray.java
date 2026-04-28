import java.util.Arrays;

public class ReverseArray {

    public static void reverse (int[]num){

        int left =0;
        int right = num.length-1;

        while(left < right){

            int temp = num[left];
            num[left]= num[right];
            num[right]= temp;

            left++;
            right--;

        }


    }

    public static void main(String[] args) {
        int []num = {2,5,7,11};


        System.out.println("original array " + Arrays.toString(num));

        reverse(num);
        System.out.println("reversed "+ Arrays.toString(num));

    }
}
