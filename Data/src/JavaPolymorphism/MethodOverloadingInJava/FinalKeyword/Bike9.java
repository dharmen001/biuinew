package JavaPolymorphism.MethodOverloadingInJava.FinalKeyword;

//Final Variable

public class Bike9 {

    public static void main(String[] args) {

        Bike10 b10 = new Bike10();
        b10.run();
    }
}

class Bike10{



    final int speedlimit = 100;//Final Variable

    void run(){

        //speedlimit = 400;
    }

        }