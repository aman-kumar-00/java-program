import java.util.ArrayList;

// optimization algorithm for finding prime number up to n
public class SieveEratosthenes {

    static ArrayList<Integer> sieve(int n) {

        boolean [] prime = new boolean[n+1];
        // creating true value for all boolean place
        for (int i = 0; i <n ; i++) {

            prime[i] = true;
        }

        //checking prime and then make their multiples false
        for (int p = 2; p*p <=n; p++) {
                if(prime [p]){
                    for (int i = p*p; i <=n ; i =i+p) {

                        prime[i] = false;
                    }
                }
        }

        // Store primes in an ArrayList

        ArrayList<Integer> res = new ArrayList<>();

        for (int p = 2; p <= n; p++) {
            if (prime[p]) {
                res.add(p);
            }
        }

        return res;




    }


    public static void main(String[] args) {

        int n = 10;

        ArrayList<Integer> res = sieve(n);

        System.out.println(res);
    }
}
