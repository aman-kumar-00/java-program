import java.util.Scanner;

public class ModuloCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value ");
        System.out.println("X % Y");
        int x = sc.nextInt();
        int y = sc.nextInt();

        int ans = x%y;
        System.out.println(ans);
    }
}
