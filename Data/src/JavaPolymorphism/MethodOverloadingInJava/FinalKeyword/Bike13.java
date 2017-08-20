package JavaPolymorphism.MethodOverloadingInJava.FinalKeyword;

//Q) Is final method inherited?

//Ans) Yes, final method is inherited but you cannot override it. For Example:

public class Bike13 {

    public static void main(String[] args) {

        Honda12 h12 = new Honda12();
        h12.run();
    }
}

class Test1Bike{

    final void run(){

        System.out.println("Running");
    }
}

class Honda12 extends Test1Bike{


}