package oops;

public class Linklist{

    private node head;
    private node tail;
    private int size;

    public Linklist(int size) {
        this.size = size;
    }

    public void insertfirst(int val){

        node node = new node(val);
        node.next = head;

        head = node;

        if (tail== null) {
            tail = head;
        }
        size+=1;
    }

   public  void display(){

    node temp = head;
    while (temp!=null){

        System.out.print(temp.value+"->");
        temp = temp.next;
    }
       System.out.println("end");
    }

    private class node{
      private   int value;
      private  node next;


        public node(int value ) {
            this.value = value;
        }

        public node(int value,node next) {
            this.next = next;
            this.value = value;
        }
    }


}
