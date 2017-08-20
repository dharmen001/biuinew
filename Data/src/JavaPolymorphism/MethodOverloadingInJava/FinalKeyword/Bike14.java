package JavaPolymorphism.MethodOverloadingInJava.FinalKeyword;

//Que) Can we initialize blank final variable?

//Yes, but only in constructor. For example:

public class Bike14 {

    public static void main(String[] args) {

        new Bike15();

    }
}

class Bike15{

    final int speedlimit;//blank final variable

    Bike15(){

        speedlimit = 100;

        System.out.println(speedlimit);
    }


        }