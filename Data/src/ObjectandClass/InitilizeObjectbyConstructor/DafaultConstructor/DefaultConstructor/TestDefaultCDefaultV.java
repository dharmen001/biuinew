package ObjectandClass.InitilizeObjectbyConstructor.DafaultConstructor.DefaultConstructor;

public class TestDefaultCDefaultV
{

    public static void main(String[] args) {

        Employee e1  = new Employee();
        Employee e2  = new Employee();
        Employee e3  = new Employee();

        e1.display();
        e2.display();
        e3.display();
    }
}


class Employee{

    int id;
    String name;
    Float salary;

    void display(){

        System.out.println(id+" "+name+" "+salary);
    }
}