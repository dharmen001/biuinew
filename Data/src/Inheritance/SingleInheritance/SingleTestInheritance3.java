package Inheritance.SingleInheritance;

public class SingleTestInheritance3 {

    public static void main(String[] args) {

        Dharmendra d1 = new Dharmendra();
        //Human h1 = new Human();

        d1.speak();

        d1.eat();
        //h1.eat();
    }
}

class Human {

    void eat() {

        System.out.println("Eating");
    }

}

class Dharmendra extends Human {

    void speak(){

        System.out.println("Speaking");
    }

        }


