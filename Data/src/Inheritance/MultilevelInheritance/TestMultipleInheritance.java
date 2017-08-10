package Inheritance.MultilevelInheritance;

public class TestMultipleInheritance {

    public static void main(String[] args) {

        Maruti800 m800 = new Maruti800();

        m800.speed();
        m800.vehicaleType();
        m800.brand();

    }
}

class car{

    public  car(){

        System.out.println("Class Car");
    }

    void vehicaleType(){

        System.out.println("vehicale Type: Car");
    }
}

class Maruti extends car{

    public Maruti(){

        System.out.println("Class Maruti");
    }

    void brand(){

        System.out.println("Brand: Maruti");
    }

    public void speed(){

        System.out.println("Max: 90KMPH");
    }
}

class  Maruti800 extends Maruti{

    public Maruti800(){

        System.out.println("Maruti Model: 800");
    }

    public void speed(){

        System.out.println("Max: 80KMPH");
    }
}