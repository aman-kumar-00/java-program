package oops;

public class Main2 {
    public static void main(String[] args) {

        Student s1 = new Student(1,25,"ak");

        System.out.println(s1);

        System.out.println(s1.getAge());

        s1.setAge(34);

        System.out.println(s1.getAge());
    }
}
