package JavaPolymorphism.MethodOverloadingInJava.StaticandDynamicBinding;

//When type of the object is determined at run-time, it is known as dynamic binding.

public class TestDynamicBinding {

    public static void main(String[] args) {

        Animal d = new Dog();
        d.eat();
    }

}

class Animal{

    void eat(){

        System.out.println("Eating..");
    }

}

class Dog extends Animal{

    void eat(){

        System.out.println("Dog is eating");
    }
}

