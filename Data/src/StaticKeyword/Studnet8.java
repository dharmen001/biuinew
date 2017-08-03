package StaticKeyword;

public class Studnet8 {

    public static void main(String[] args) {

        TestStudent8 ts1 = new TestStudent8(10,"Dharmendra");
        TestStudent8 ts2 = new TestStudent8(20,"Gaurav");
        TestStudent8 ts3 = new TestStudent8(ts1);
        TestStudent8 ts4 = new TestStudent8(ts2);
        ts1.display();
        ts2.display();
        ts3.display();
        ts4.display();


    }
}


class TestStudent8{

    int rollno;
    String name;
    static String college = "RGPV";


    TestStudent8(int i, String n){

        rollno = i;
        name = n;
    }

    TestStudent8(TestStudent8 ts8){

        rollno = ts8.rollno;
        name = ts8.name;
    }

    void display(){

        System.out.println(rollno+" "+name+" "+college);
    }

}