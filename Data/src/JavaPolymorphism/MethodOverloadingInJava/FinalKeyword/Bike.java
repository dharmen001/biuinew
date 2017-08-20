package JavaPolymorphism.MethodOverloadingInJava.FinalKeyword;

//Java Final Method

public class Bike {

    public static void main(String[] args) {

        Honda h1 =new Honda();

            h1.run();

    }
}


class TestBike{

    final void run(){

        System.out.println("Running");
    }

}

class Honda extends TestBike
{

    /*void run(){

        System.out.println("Running safely with 100KMPH");
    }
*/
}

