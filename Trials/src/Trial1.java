import java.util.*;

class Calculation {
    int z;

    public void addition(int x, int y) {
        z = x + y;
        System.out.println("The sum of the given numbers:"+z);
    }

    public void Subtraction(int x, int y) {
        z = x - y;
        System.out.println("The difference between the given numbers:"+z);
    }
}

class My_Calculation extends Calculation {
    public void multiplication(int x, int y) {
        z = x * y;
        System.out.println("The product of the given numbers:"+z);
    }


}



public class Trial1 {
    public void code(String s)
    {
        System.out.print("Java ");
    }

    public void write(Object o)
    {
        System.out.print("Language");
    }

    private int x= 1;
    private String st="Number";
   /* public void innerInstance()
    {
        MyInnerClass inner = new MyInnerClass();
        inner. seeOuter(); /**Line A**/
   //}*/
    public static void main(String args[]) {
        /*int a = 20, b = 10;
        My_Calculation demo = new My_Calculation();
        demo.addition(a, b);
        demo.Subtraction(a, b);
        demo.multiplication(a, b);
        Calculation c=new Calculation();
        Calculation c1=new My_Calculation();*/
       /* LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(-8);
        list.add(10);
        list.add(-20);
        list.add(null);
        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(list, r);
        for(int i : list)
            System.out.print(i+ " ");
        System.out.println();*/
       /* Trial1 r = new Trial1();

        r.code("Object ");
        r.write(555);*/
        /*Integer var1 = new Integer(25);
        Integer var2 = new Integer(25);
        System.out.println("" + (var1 == var2));
        System.out.println("" + var1.equals(var2));*/
        /*Trial1 obj = new Trial1();
        obj.innerInstance();*/
        Map<String, String> Hacker = new HashMap<>();
        Hacker.put("Key 1", "Value 1");
        Hacker.put("Key 2", "Value 2");
        Trial1.iterateMap(Hacker);

    }

    public static void iterateMap(Map<String, String> Hacker)
    {
        for(Map.Entry<String, String> entry:Hacker.entrySet())
        {
            System.out.print(entry.getValue()+", "+entry.getKey());
        }
    }
   /* private class MyInnerClass /**Line B**/
   /* {
        private void seeOuter () {
            System.out.println(st+" "+x);
        }
    }*/
}




