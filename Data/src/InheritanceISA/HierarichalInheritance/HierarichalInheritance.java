package InheritanceISA.HierarichalInheritance;

public class HierarichalInheritance {

    public static void main(String[] args) {

        cat c = new cat();
        c.Meow();
        c.eat();
        //c.barking();//CT Error


    }

}

class Animal{

    void eat(){

        System.out.println("eating..");
    }
        }

class Dog extends Animal{

    void barking(){

        System.out.println("Barking");
    }
}

class cat extends Animal{

    void Meow(){

        System.out.println("Meow..");
    }
}