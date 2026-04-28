package Recursion;

public class Nto1 {
    public static void main(String[] args) {

        funrev(5);
    }

    static void funrev(int n){

        if(n==0){
            return;
        }


        System.out.print(" "+n);
        funrev(n-1);
        System.out.print("  "+n);


    }
}
