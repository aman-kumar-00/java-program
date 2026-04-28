// largest and smallest element in an array

import java.util.Scanner;

public class largestArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        //size of the array
        System.out.println("enter the size of the arrray");
        int n = sc.nextInt();

        //creating array
        int [] arr = new int[n];

        //storing elements
        System.out.println("enter the numbers");

        for (int i = 0; i <n ; i++) {

            arr[i] = sc.nextInt();
        }
        //let first value is maximum
        int maxval = arr[0];
        int minval = arr[0];

        // logic, here to find the max and min value in array
        for (int i = 0; i <arr.length; i++) {

            if(arr[i]>maxval){

                maxval= arr[i];

            }else{
                if(arr[i]<minval){
                    minval =arr[i];
                }

            }
        }
        System.out.println("max value  "+maxval);
        System.out.println("min value "+minval);

    }
}


