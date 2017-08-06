package ThisKeyword;

//4) this: to pass as an argument in the method

//The this keyword can also be passed as an argument in the method.
//It is mainly used in the event handling.

public class Student15 {

    public static void main(String[] args) {

        TestStudent15 testStudent15 = new TestStudent15();
        testStudent15.newstudent();
    }
}

class  TestStudent15{

    void student(TestStudent15 ts15){

        System.out.println("student method is invoked");
    }

    void newstudent(){

        student(this);
    }

}