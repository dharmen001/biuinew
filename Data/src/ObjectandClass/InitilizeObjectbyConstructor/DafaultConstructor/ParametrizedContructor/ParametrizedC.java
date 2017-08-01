package ObjectandClass.InitilizeObjectbyConstructor.DafaultConstructor.ParametrizedContructor;

//A cosntructor that have parameter is known as parameterized constructor.
//parametrized Constructor provides is used to provide to different values to distinct objects.

public class ParametrizedC
{

    public static void main(String[] args)
    {

        Exponential ex1 = new Exponential(23,"Sector 142",10);
        Exponential ex2 = new Exponential(24,"Sector 142",10);
        Exponential ex3 = new Exponential(25,"Sector 142",10);

        ex1.information();
        ex2.information();
        ex3.information();
    }


}


class Exponential
{

    int employees;
    String address;
    int Team;

    Exponential(int e, String a, int t)
    {

        employees = e;
        address =a;
        Team = t;
    }

    void information()
    {
        System.out.println(employees+" "+address+" "+Team);
    }

}