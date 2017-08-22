package JavaPolymorphism.MethodOverloadingInJava.RunTimePolymorphism.MultilevelInheritance;

public class TestAnimal2 {

    public static void main(String[] args) {

        Animal a1,a2,a3;
        a1= new Animal();
        a1.eat();

        a2 = new Dog();
        a2.eat();

        a3 = new BabyDog();
        a3.eat();
    }


}

class Animal{

    void eat(){

        System.out.println("Eating....");
    }
}

class Dog extends Animal{


    void eat(){

        System.out.println("Eating Fruits...");
    }
}

class BabyDog extends Dog{

    void eat(){

        System.out.println("Drinking Milk");
    }
}
