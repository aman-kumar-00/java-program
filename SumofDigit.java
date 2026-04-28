package Recursion;

public class SumofDigit {
    public static void main(String[] args) {

        long ans = sum(1870022300989754335L);
        System.out.println(ans);
    }
    static long sum (long n){
        if(n==0){
            return 0;
        }

        return n%10 +sum(n/10);

    }
}
