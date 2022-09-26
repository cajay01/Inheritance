package predicate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {

    public Employee(Integer id, Integer age, String gender, String fName, String lName){
        this.id = id;
        this.age = age;
        this.gender = gender;
        this.firstName = fName;
        this.lastName = lName;
    }

    private Integer id;
    private Integer age;
    private String gender;
    private String firstName;
    private String lastName;

    //Please generate Getter and Setters

    //To change body of generated methods, choose Tools | Templates.
    @Override
    public String toString() {
        return this.id.toString()+" - "+this.age.toString();
    }

    public int getAge() {
        return this.age;
    }
}

public class PredicateTrial {

    public static void main(String args[]){

        Employee e1 = new Employee(1,23,"M","Rick","Beethovan");
        Employee e2 = new Employee(2,13,"F","Martina","Hengis");
        Employee e3 = new Employee(3,43,"M","Ricky","Martin");
        Employee e4 = new Employee(4,26,"M","Jon","Lowman");
        Employee e5 = new Employee(5,19,"F","Cristine","Maria");
        Employee e6 = new Employee(6,15,"M","David","Feezor");
        Employee e7 = new Employee(7,68,"F","Melissa","Roy");
        Employee e8 = new Employee(8,79,"M","Alex","Gussin");
        Employee e9 = new Employee(9,15,"F","Neetu","Singh");
        Employee e10 = new Employee(10,45,"M","Naveen","Jain");
        List<Employee> employees = new ArrayList<Employee>();
        employees.addAll(Arrays.asList(new Employee[]{e1,e2,e3,e4,e5,e6,e7,e8,e9,e10}));
        Predicate<Employee> pr=a->(a.getAge()>18);


        employees.stream()
                .filter(pr)
                .forEach(System.out::println);

       List<Employee>ee= employees.stream().filter(pr).collect(Collectors.<Employee>toList());
       System.out.println(ee.get(1));
        /*List<Integer> nums = List.of(2, 3, 1, 5, 6, 7, 8, 9, 12);

        Predicate<Integer> btf = n -> n > 5;

        nums.stream().filter(btf).forEach(System.out::println);*/
    }

   /* private static Predicate<? super Employee> isAgeMoreThan(int i) {

    }*/


}
