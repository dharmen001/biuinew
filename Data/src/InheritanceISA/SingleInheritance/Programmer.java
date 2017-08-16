package InheritanceISA.SingleInheritance;

public class Programmer extends Employee{
    int bonus = 1000;

    public static void main(String[] args) {
        Programmer p = new Programmer();

        System.out.println("Programmer salary is"+" "+ p.bonus);
        System.out.println("Employee salary is"+" "+p.salary);


    }

}

class Employee{

    float salary = 10000;
}