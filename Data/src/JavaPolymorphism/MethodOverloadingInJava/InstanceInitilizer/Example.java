package JavaPolymorphism.MethodOverloadingInJava.InstanceInitilizer;

public class Example {

    public static void main(String[] args) {

        Bike7 b1  = new Bike7();
        Bike7 b2 = new Bike7();
    }
}

class Bike7{

    int speed;

    Bike7(){

        System.out.println("Speed is " + speed);}

    {
        speed = 100;
    }




}
