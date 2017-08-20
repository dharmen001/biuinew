package JavaPolymorphism.MethodOverloadingInJava.InstanceInitilizer;

public class ATest2
{

    public static void main(String[] args) {


        B2New b2 = new B2New();
        B2New b3 = new B2New(10);
    }
}

class ANew{

    ANew(){

        System.out.println("Parent class construtor");
    }
}

class B2New extends ANew {

    B2New(){

        super();
        System.out.println("child class construtor");
    }

    B2New(int a){

        System.out.println( "child class construtor" + a);
    }

    {

        System.out.println("instance initilizer block is invoked");
    }
}