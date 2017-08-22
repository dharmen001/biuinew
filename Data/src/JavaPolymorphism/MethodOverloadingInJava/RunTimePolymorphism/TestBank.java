package JavaPolymorphism.MethodOverloadingInJava.RunTimePolymorphism;

public class TestBank {

    public static void main(String[] args) {

        Bank b;

        b = new SBI();


        System.out.println("SBI RATE of int " + b.getrateofintrest());

        b= new Icici();

        System.out.println("ICICI RATE of int " + b.getrateofintrest());

        b = new Axis();

        System.out.println("Axis rate of int " + b.getrateofintrest());
    }
}

class Bank{

    float getrateofintrest(){

        return 0;
    }
}

class SBI extends Bank{

    float getrateofintrest(){

        return 7.9f;
    }
}

class Icici extends Bank {

    float getrateofintrest(){

        return 8.10f;
    }
}

class Axis extends Bank{

    float getrateofintrest(){

        return 9.9f;
    }
}

