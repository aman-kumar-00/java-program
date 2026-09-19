public class Prime {
    public static void main(String[] args) {


        int n = 7;
        boolean isprime = true;

//        for (int i = 2; i <= n - 1; i++) {
//
//            if (n%i==0) {
//                isprime = false;
//               break;
//
//            }
//        }

        //optimize code

        for (int i = 2; i * i <=n; i++) {

            if (n % i == 0) {
                isprime = false;
                break;
            }

        }

        if (isprime) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

}

