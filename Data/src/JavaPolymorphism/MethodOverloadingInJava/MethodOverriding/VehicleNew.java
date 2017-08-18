package JavaPolymorphism.MethodOverloadingInJava.MethodOverriding;

public class VehicleNew {

    public static void main(String[] args) {

        Bike2 bk2 = new Bike2();
        bk2.run();
    }

}


class TestVehicle{

    void run(){

        System.out.println("Vehicle is running");
    }

}

class Bike2 extends TestVehicle{

    void run() {

        System.out.println("Bike is running safely");
    }
}