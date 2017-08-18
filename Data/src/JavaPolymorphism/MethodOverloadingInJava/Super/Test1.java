package JavaPolymorphism.MethodOverloadingInJava.Super;

//1.super is used to refer immediate parent class instance variable.

public class Test1 {

    public static void main(String[] args) {

        Dog d = new Dog();
        d.printColor();
    }

}

class Animal{

    String color = "White";
}

class Dog extends Animal{

    String color =  "black";

    void printColor(){

        System.out.println(color);
        System.out.println(super.color);//Print color of animal class
    }
}