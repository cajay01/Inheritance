package interfaceCheck;

public interface intreface2 {
    public void method1();
    default void one2(){
        System.out.println("Method2");
    }
    default void one(){
        System.out.println("Method1");
    }
}
