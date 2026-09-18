public class Gcd_Lcm {
    public static void main(String[] args) {

        System.out.println(getgcd(12,18));
        System.out.println(getlcm(12,18));
    }

    // method for finding gcd
    static int getgcd(int a , int b){

        while(b!=0){

            int oldvalueofb =b;
             b = a%b;
             a = oldvalueofb;

        }
        int ans = a;

        return ans;

    }

    //method for finding lcm

    static int getlcm(int a, int b){

        int product = a*b;
        int gcd = getgcd(a,b);

        int lcm = product/gcd;

        return lcm;
    }


}
