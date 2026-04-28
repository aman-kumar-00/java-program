//using binary search we will find the ceiling number which is the smallest element
// in arr which is greater and equal to target.

public class ceilingNumber {

    public static void main(String[] args) {

        int []arr = {2,4,5,7,9,12,56,78};
        int target;
        int ans = binarySearch(arr, 8);
        System.out.println("found at index "+ans);

    }

    static int binarySearch(int[] arr, int target){
        int start =0;
        int end = arr.length-1;

        while(start <= end){

            int mid = start+(end-start)/2;
            if(target<arr[mid]){
                end = mid-1;
            } else if (target>arr[mid]) {
                start = mid+1;
            }else {
                return mid;
            }


        }

        return start;



    }
}
