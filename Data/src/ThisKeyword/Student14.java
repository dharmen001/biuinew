package ThisKeyword;

import java.util.SplittableRandom;

public class Student14 {
    public static void main(String[] args) {

        TestStudent14 ts14 = new TestStudent14(11,"dh","be",2333f);
        TestStudent14 ts15 = new TestStudent14(12,"dd","www");
        ts14.display();
        ts15.display();
    }

}

class TestStudent14{

    int rollno;
    String name, course;
    float fee;

    TestStudent14(int rollno, String name,String course)
    {

        this.rollno = rollno;
        this.name = name;
        this.course = course;

    }


    TestStudent14(int rollno,String name,String course,float fee){


        this(rollno,name,course);
        this.fee = fee;
    }

    void display(){

        System.out.println(rollno+" "+name+" "+course+" "+fee);
    }
}