package ThisKeyword;


//Under the problem if we won't use this in programme.
//The this keyword can be used to refer current class instance variable.
//If there is ambiguity between the instance variables and parameters,
//This keyword resolves the problem of ambiguity.

public class Student10 {

    public static void main(String[] args) {

        TestStudent10 ts1 = new TestStudent10(10,"Dharmendra",2929f);
        TestStudent10 ts2 = new TestStudent10(11,"Dharmendra",2222f);

        ts1.display();
        ts2.display();
    }



}

class TestStudent10{

    int rollno;
    String name;
    float fee;

    TestStudent10(int rollno,String name, float fee){

        //Using real variable is good approach in programme.this keyword resolve the ambiguity.
        this.rollno = rollno;
        this.name = name;
        this.fee = fee;
    }

    void display(){

        System.out.println(rollno+" "+name+" "+fee);
    }


}
