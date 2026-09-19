package Recursion;

public class Linear {
    public static void main(String[] args) {

        int []arr = {1,3,4,4,6};
        System.out.println( find(arr,4,0));
        System.out.println("found at index "+ findIndex(arr,4,0));
    }
    // find if element present or not by true and fale
    static boolean find(int[]arr,int target,int index){

        if(index==arr.length){
            return  false;
        }

        return arr[index]==target || find(arr, target, index+1);
    }

    // finding index and printing it
    static int findIndex(int[]arr,int target,int index){

        if(index== arr.length){
            return -1;
        }

        if(arr[index]==target){

            return index;
        }else {

            return findIndex(arr,target,index+1);
        }

    }

}
