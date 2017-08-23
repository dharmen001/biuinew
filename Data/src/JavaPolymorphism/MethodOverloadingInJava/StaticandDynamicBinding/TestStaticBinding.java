package JavaPolymorphism.MethodOverloadingInJava.StaticandDynamicBinding;

//static binding

//When type of the object is determined at compiled time(by the compiler), it is known as static binding.

//If there is any private, final or static method in a class, there is static binding.

public class TestStaticBinding {

    private  void fueltype(){

        System.out.println("Petrol");
    }

    public static void main(String[] args) {

        TestStaticBinding ts1 = new TestStaticBinding();

        ts1.fueltype();

    }
}


