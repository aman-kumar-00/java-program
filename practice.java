import java.util.Scanner;
public class practice {
    public static void main(String [] args){

        System.out.println("enter the name");

        for(int i=0;i<5;i++) {
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            System.out.println("good morning "+name);

        }

    }
}
