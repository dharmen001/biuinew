package ObjectandClass.CopyConstructor;

public class Student6 {
    public static void main(String[] args) {

        TestStudent6 s1 = new TestStudent6(23, "Dharmendra");
        //TestStudent6 s2 = new TestStudent6(24, "Gaurav");
        TestStudent6 s3 = new TestStudent6(s1);
        //TestStudent6 s4 = new TestStudent6(s2);
s1.display();
//s2.display();
s3.display();
//s4.display();


    }



}

class TestStudent6
{
    int id;
    String name;

    TestStudent6(int i, String n){

        id = i;
        name = n;
    }

    TestStudent6(TestStudent6 s){

        id = s.id;
        name = s.name;
    }

    void display(){

        System.out.println(id+" "+name);
    }


}
