package ObjectandClass.InitilizeObjectbyConstructor.DafaultConstructor.DefaultConstructor;

//Defines default Value on Default Contructor

public class DefalutCDefaultV {

    public static void main(String[] args) {

        Student3 s3 = new Student3();
        Student3 s4 = new Student3();

        s3.display();
        s4.display();


    }
}

class Student3
{
    int id;
    String name;

    void display()
    {
        System.out.println(id+" "+name);
    }
}