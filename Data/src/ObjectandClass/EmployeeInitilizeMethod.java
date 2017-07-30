package ObjectandClass;

public class EmployeeInitilizeMethod {
    public static void main(String[] args) {

        Employee e1= new Employee();
        Employee e2= new Employee();
        Employee e3 = new Employee();

        e1.insert(11,"Dhar",29000);
        e2.insert(12,"Gau",39000);
        e3.insert(13,"Sur",40000);

        e1.information();
        e2.information();
        e3.information();
    }

}

class Employee{

    int id;
    String Name;
    float salary;
    void insert(int i,String n, float s)
    {

        id =i;
        Name = n;
        salary = s;
    }

    void information()
    {
        System.out.println(id+" "+Name+" "+salary);

    }

}