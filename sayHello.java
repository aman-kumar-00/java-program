package Recursion;

public class sayHello {
    public static void main(String[] args) {

    text();

    }

    // here text method print output and call to text1 method
    static void text(){
        System.out.println("hi , how are you");
        text1();
    }

    // text 1 print and calls to text 2
    static void text1(){
        System.out.println("hi , how are you");
        text2();
    }

    static void text2(){
        System.out.println("hi , how are you");
        text3();
    }

    //after printing text 3 it will go to text 2 and similary go back and process exits
    static void text3(){
        System.out.println("hi , how are you");
    }
}
