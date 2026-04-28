public class linear {
    public static void main(String[] args){


        int []arr = {8,10,12,15,1};

        int target = 15;
        boolean found = false;

        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==target){

                System.out.println("the target found at "+i);

                found =true;
                break;
            }
            }
            if(!found){
                System.out.println("not found ");
            }
        }

    }

