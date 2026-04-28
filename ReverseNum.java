package Recursion;

public class ReverseNum {
    public static void main(String[] args) {


        System.out.println(helperrev(576));
    }

    static int helperrev(int n){

       return reverse(n,0);
    }

    static int reverse(int n,int rev){

        if(n==0){
            return rev;
        }

        return reverse(n/10,rev*10+n%10);


    }
}
