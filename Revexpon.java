package Recursion;

// Given a number n, find the value of n raised to the power of its own reverse.

public class Revexpon {
    public static void main(String[] args) {


        System.out.println(calculateexpo(5));

    }

    // this is a function to calculate exponent , it will call reverse function  too
    static int calculateexpo(int n){

        int rev = reverse(n,0);

        return (int)Math.pow(n,rev);


    }

    static  int reverse(int n , int rev){

        if(n==0){

            return rev;
        }
            return reverse(n/10,rev*10+n%10);
    }
}
