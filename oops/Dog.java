package oops;

public class Dog extends Animal{
    String color ="black";
   void bark(){

       System.out.println("woof-woof");
   }
   void color(){
       System.out.println(super.color);
   }
}
