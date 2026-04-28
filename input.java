
import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();  // Taking string input

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();  // Taking integer input

        System.out.println("Hello, " + name + ". You are " + age + " years old.");

        scanner.close();
    }
}
