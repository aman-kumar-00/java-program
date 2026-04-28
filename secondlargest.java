public class secondlargest {
    public static void main(String[] args) {

        // this is sorted array // brute force method

//        int [] arr = {1,1,1,1,1,1};
//
//        int n = arr.length;
//        int largest = arr[n-1];
//        int second = -1;
//
//
//        for (int i = n-2; i>=0 ; i--) {
//
//            if(arr[i]!=largest){
//
//                second = arr[i];
//                break;
//            }
//        }
//        if(second==-1){
//            System.out.println("no second largest element found ");
//        }else{
//            System.out.println("2nd largest is "+second);

        // optimal approach for second largest
        int [] arr = {2,9,3,10,0};

        int largest = arr[0];
        int seclargest = -1;

        for (int i = 0; i < arr.length ; i++) {

            if(arr[i]>largest){

                seclargest = largest;
                largest = arr[i];
            } else if (arr[i]<largest && arr[i]>seclargest) {
                seclargest =arr[i];
                
            }

        }
        System.out.println("second largest is " +seclargest);




        }


    }
