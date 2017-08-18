package JavaPolymorphism.MethodOverloadingInJava.Super;
//Super can be used to invoke parent class method
//The super keyword can also be used to invoke parent class method.
// It should be used if subclass contains the same method as parent class.
// In other words, it is used if method is overridden.
public class Test2 {

    public static void main(String[] args) {
        DogTest DT = new DogTest();
        DT.work();
    }
}

class AnimalTest{

    void eat(){

        System.out.println("eating");
    }

}

class DogTest extends AnimalTest {

    void eat(){
        System.out.println("eating bread");
    }

    void bark(){

        System.out.println("Barking");
    }

    void work(){

        super.eat();
        bark();
        eat();
    }
}