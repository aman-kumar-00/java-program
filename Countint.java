public class Countint {

    public static int countdigit(int n) {
        n = Math.abs(n);
        if (n == 0) return 1;


        int count = 0;
        while (n > 0) {
            n = n / 10;
            count++;
        }
        return count;

    }

    public static void main(String[] args) {

        System.out.println("the no of digit is "+countdigit(2345));
        System.out.println("the no of digit is "+countdigit(0));
        System.out.println("the number of digit is "+countdigit(-789));

    }


}
