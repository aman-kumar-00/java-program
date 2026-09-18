package oops;

public class Test {
    public static void main(String[]args){
        Dog dog = new Dog();
        dog.name="king";
        System.out.println("name "+ dog.name);


        dog.makesound();
        dog.bark();
        dog.eat();
        dog.color();
    }
}
