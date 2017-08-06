package ThisKeyword;

//3) this() : to invoke current class constructor

//The this() constructor call can be used to invoke the current class constructor.
//It is used to reuse the constructor. In other words, it is used for constructor chaining.

public class Student13 {

    public static void main(String[] args) {

        TestStudent13 ts13 = new TestStudent13(12,"Dhar","BE");
        TestStudent13 ts14 = new TestStudent13(23,"ga","Bsc",200f);
        ts13.display();
        ts14.display();

    }


}

class TestStudent13{

    int rollno;
    String name,course;
    float fee;

    TestStudent13(int rollno,String name,String course){
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    TestStudent13(int rollno,String name,String course,float fee){

        this(rollno,name,course);
        this.fee=fee;
    }

    void display(){

        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }

}

