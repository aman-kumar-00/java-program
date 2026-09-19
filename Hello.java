import java.util.Scanner;
public class Hello{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();

        for(int i =0; i<5;i++){

            System.out.println("hello."+name);
        }

    }
}