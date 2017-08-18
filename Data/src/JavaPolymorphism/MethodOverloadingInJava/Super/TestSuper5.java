package JavaPolymorphism.MethodOverloadingInJava.Super;

public class TestSuper5 {

    public static void main(String[] args) {

        Emp e1 = new Emp(123,"Dharmendra",233.43f);
        e1.display();
    }
}

class Person{

    int id;
    String name;

    Person(int id, String name){

         this.id = id;
         this.name = name;
    }

}

class Emp extends Person{

    float salary;
    Emp(int id,String name, float salary){

        super(id, name);
        this.salary = salary;
    }

    void display()
    {

        System.out.println(id+" "+name+" "+salary);
    }

}