package ThisKeyword;

//2) this: to invoke current class method

//You may invoke the method of the current class by using the this keyword.
// If you don't use the this keyword,
// compiler automatically adds this keyword while invoking the method.

public class Student11 {

    public static void main(String[] args) {

        TestStudent11 ts11 = new TestStudent11();

        ts11.information();
    }


}

class TestStudent11{

    void display(){

        System.out.println("hellodisplay");
    }

    void information(){

        System.out.println("helloinformation");

        this.display();
    }
}
