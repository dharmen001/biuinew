package Inheritance.SingleInheritance;

public class SingleTestInheritance {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.eat();
        d.bark();
        
    }
}


class Animal{

    void bark()
    {
        System.out.println("barking");
    }
}


class Dog extends Animal{

    void eat(){
        System.out.println("eating..");
    }
}