package JavaPolymorphism.MethodOverloadingInJava.JavaInstanceOF;

//An object of subclass type is also a type of parent class
//For example,
//if Dog extends Animal then object of Dog can be referred by either Dog or Animal class.

public class Example2 {

    public static void main(String[] args) {

        Dog1 d1 = new Dog1();

        System.out.println(d1 instanceof Animal);
    }

}

class Animal{


}

class Dog1 extends Animal{



}