import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        System.out.println("enter number to convert in binary ");
        Scanner sc = new Scanner(System.in);

        int num =  sc.nextInt();

        int n = num;
     StringBuilder sd = new StringBuilder();

        while(n>0){
        sd.append(n%2);
        n=n/2;

        }
        System.out.println(sd.reverse());
    }
}
