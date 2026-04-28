import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        Scanner myscan = new Scanner(System.in);

        System.out.println("enter the number to check palindrome ");
        int num = myscan.nextInt();
        int original = num;


        int rev = 0;

        if(num<0){

            System.out.println("negative number is not palindrome");
        }

        while (num>0){
            int digit = num%10;
            rev = rev*10+digit;
            num = num/10;


        }
            if(rev==original){
                System.out.println("number is palindrome");
            }else {
                System.out.println("not palindrome");
            }
    }
}
