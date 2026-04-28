package Recursion;

public class Facto {
    public static void main(String[] args) {

        int ans = facto(5);

        System.out.println(ans);
    }

    static int facto(int n){

        if(n<=1){
            return 1;
        }

        return  n * facto(n-1);
    }
}
