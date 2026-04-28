public class recur {
    public static void main(String[]args){

    word();

    }


    static void word(){
        System.out.println("hello world");
        word1();
    }
    static void word1(){
        System.out.println("hello world");
        word2();
    }
    static void word2(){
        System.out.println("hello world");
        word3();
    }
    static void word3(){
        System.out.println("hello world");
    }
}
