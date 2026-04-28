import java.util.Scanner;

public class printTable {
    public static void main(String[] args) {
        System.out.println("enter number for tableof ");
        Scanner t1 = new Scanner(System.in);
        int n = t1.nextInt();
        for (int i = 1; i <=10; i++) {
           int a= i*n;
            System.out.println(a);

        }
    }
}
