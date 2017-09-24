package JavaPolymorphism.MethodOverloadingInJava.JavaInstanceOF;

//Understanding Real use of instanceof in java

//Let's see the real use of instanceof keyword by the example given below.

public class ExampleReal {

    public static void main(String[] args) {

        printable p = new B();
        Call c = new Call();
        c.invoke(p);
    }

}

interface printable{}

class A implements printable{

    public void a(){

        System.out.println("a method");
    }
}

class B implements printable{

    public void b(){

        System.out.println("b method");
    }
}

class Call

{

    void invoke(printable p){//upcasting

        if(p instanceof A){

            A a = (A)p;//Downcasting
            a.a();
        }

        if(p instanceof B){

            B b = (B) p;
            b.b();
        }
    }
}



