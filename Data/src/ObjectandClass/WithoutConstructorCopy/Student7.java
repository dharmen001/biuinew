package ObjectandClass.WithoutConstructorCopy;

import ObjectandClass.Student;

public class Student7
{

    public static void main(String[] args) {

        TestStudent7 s1 = new TestStudent7(111,"Dh");
        TestStudent7 s2 = new TestStudent7();

        s2.id = s1.id;
        s2.name = s1.name;


        s1.display();
        s2.display();


    }



}

class TestStudent7
{

    int id;
    String name;

    TestStudent7(int i, String n){

        id = i;
        name = n;


    }

    TestStudent7(){


    }

    void  display()
    {

        System.out.println(id+" "+name);

    }

}