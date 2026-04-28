import java.util.Scanner;
public class Armstrong {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to check armstrong");

        int num = sc.nextInt();

        int Original = num;
        int temp = num;
        int digit = 0;

        //counting
        while(temp>0){

            temp = temp/10;
             digit++;
        }
        temp = num;
        int sum =0;

        //calculate armstrong number
        while (temp>0){
            int digit1 = temp % 10;
            sum += Math.pow(digit1, digit);
            temp /= 10;

        }

        if (sum == Original)
            System.out.println("Armstrong Number");
        else
            System.out.println("Not an Armstrong Number");



    }
}
