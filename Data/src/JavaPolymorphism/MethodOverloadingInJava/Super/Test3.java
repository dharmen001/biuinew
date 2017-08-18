package JavaPolymorphism.MethodOverloadingInJava.Super;

//3) super is used to invoke parent class constructor.
//The super keyword can also be used to invoke the parent class constructor.
// Let's see a simple example:

public class Test3 {

    public static void main(String[] args) {
        DogTest3 d1 = new DogTest3();
    }
}

class AnimalTest3{

    AnimalTest3(){

        System.out.println("Animal is created");
    }
}

class DogTest3 extends AnimalTest3
{

    DogTest3(){

        super();
        System.out.println("dog is created");
    }
}
