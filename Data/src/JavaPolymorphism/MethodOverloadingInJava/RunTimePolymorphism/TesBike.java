package JavaPolymorphism.MethodOverloadingInJava.RunTimePolymorphism;

public class TesBike {

    public static void main(String[] args) {

        Bike B = new Splender();

        B.run();


    }


}


class Bike{

    void run(){

        System.out.println("BBike is running");
}

}

class Splender extends Bike

{

    void run()
    {

        System.out.println("Running safely with 60KM");
    }
}

