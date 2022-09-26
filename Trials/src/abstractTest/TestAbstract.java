package abstractTest;

abstract class Bike{
    int a;
    Bike()
    {
        System.out.println("bike is created");
    }
    abstract void run();
    void changeGear()
    {
        System.out.println("gear changed");
    }
}
//Creating a Child class which inherits Abstract class
class Honda extends Bike{
    Honda(){
        System.out.println("Const Honda");
    }
    void run()
    {
        System.out.println("running safely..");
        a=10;
        System.out.println("running safely.."+a);
    }
}


public class TestAbstract {
    public static void main(String args[]){
        Honda h1=new Honda();
        h1.run();
         System.out.println("abc".equals("ABC"));
    }
}
