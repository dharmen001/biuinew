package JavaPolymorphism.MethodOverloadingInJava.InstanceInitilizer;

public class ATest1 {

    public static void main(String[] args) {

        B2 b = new B2();
    }
}


class A{

    A(){

        System.out.println("Parent class contructor invoked");
    }
}

class B2 extends A {

    B2(){

        super();

        System.out.println("Child class constructor invoked");
    }

    {

        System.out.println("insatnce initilizer block is invoked");
    }
}