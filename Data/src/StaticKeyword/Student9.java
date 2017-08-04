package StaticKeyword;

public class Student9
{

    public static void main(String[] args) {
        TestStudent9.change();

        TestStudent9 ts9 = new TestStudent9(10,"Dharmendra");
        TestStudent9 ts10 = new TestStudent9(11,"Gaurav");

        ts9.display();
        ts10.display();
    }



}

class TestStudent9{

    int id;
    String name;
    static String school = "SSHS";

    TestStudent9(int i, String n){

        id = i;
        name = n;
    }

    TestStudent9(int i,String n,String s ){

        id = i;
        name = n;
        school = s;
    }

    static void change(){

        school = "SSG";
    }

    void display(){
        System.out.println(id+" "+name+" "+school);
    }
}