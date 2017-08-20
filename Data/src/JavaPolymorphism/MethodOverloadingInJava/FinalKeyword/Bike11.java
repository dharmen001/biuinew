package JavaPolymorphism.MethodOverloadingInJava.FinalKeyword;

// Java Final Class
// you can not extend it

public class Bike11 {

    public static void main(String[] args)
    {
        Honda1 h1 = new Honda1();
        h1.run();

    }
}

final class Bike12{}



    class Honda1{
    //extends Bike12{

        void run(){

            System.out.println("Running safely with 100kmph");
        }
    }
