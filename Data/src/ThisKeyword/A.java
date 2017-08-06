package ThisKeyword;

//5) this: to pass as argument in the constructor call
// We can pass the this keyword in the constructor also.
//It is useful if we have to use one object in multiple classes.

public class A {

    public static void main(String[] args) {

        TestA  a = new TestA();
    }
}

class B{

    TestA obj;

    B(TestA obj){

        this.obj = obj;
    }

    void display(){

        System.out.println(obj.data);
    }
}

class TestA{

    int data = 10;

    TestA(){

        B b = new B(this);
        b.display();
    }
}