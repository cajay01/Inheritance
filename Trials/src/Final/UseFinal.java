package Final;

class FinalCheck{
    final int a;
    FinalCheck(int a){
        this.a=a;
    }
}

   class A
{
       static{
        System.out.println("A" ) ;
        }
        {
            System.out.println ("B");
        }
        A()
        {
            System.out.println("C");
        }
        A(int a){
            System.out.println("F");
        }
        public void mymethod(){
           System.out.println("Hi");
        }
        }

        class B extends A
        {
static{
        System.out.println("D" ) ;
        }
        B()
        {
        super(10);System.out.println("E");
        }

            public void mymethod(){

                System.out.println("Hello");
                super.mymethod();
                this.thisMethod();
            }
            public void thisMethod(){
          System.out.println("this");
            }
        }
public class UseFinal {
    public static void main(String args[]){

     B b=new B();
     b.mymethod();
    }
}
