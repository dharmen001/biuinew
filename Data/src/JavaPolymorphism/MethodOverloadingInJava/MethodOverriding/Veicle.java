package JavaPolymorphism.MethodOverloadingInJava.MethodOverriding;
//Problem is that I have to provide a specific implementation of run()
// method in subclass that is why we use method overriding.

public class Veicle {
}


class Vehicle{

    void run(){

        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle{

    public static void main(String[] args) {

        Bike obj = new Bike();
        obj.run();
    }
}