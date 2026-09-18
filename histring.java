import java.util.Scanner;

public class histring {
    public static void main(String[] args) {

        // IMPORTANT
        // STRING IS IMMUTABLE IN JAVA

        String s = "  Hello  ";
        String p = "hell04567";
        int num = 7001;
        String str = String.valueOf(num);


        s = s.replace('l','b');

        System.out.println(s);

        System.out.println(num+1);
        System.out.println(str+1);


        System.out.println(s.length());
        s = s.trim();
        System.out.println(s.length());

//        Scanner sc = new Scanner(System.in);
//
//        String name = sc.nextLine();
//
//        System.out.println("welcome "+name);

      //  System.out.println(s.charAt(0));
        
//        String []arr = {"hi","jo","lo","po"};
//
//        for (int i = 0; i < arr.length ; i++) {
//
//            System.out.println(arr[i]);
//
//        }



    }
}
