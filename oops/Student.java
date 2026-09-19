package oops;

public class Student {

    private int id;
    private int age;
    private String name;


// parameterized constuctor
   public Student(int id , int age ,String name){
        this.id = id;
        this.age = age;
        this.name = name;

    }



    public int getAge() {
        return this.age;
    }

    public void setAge(int a){
       this.age = a;
    }

    private  void chattinggf(){
        System.out.println("chatting with gf");
    }

    @Override
    public String toString(){
        return id + " " + age + " " + name;
    }
}
