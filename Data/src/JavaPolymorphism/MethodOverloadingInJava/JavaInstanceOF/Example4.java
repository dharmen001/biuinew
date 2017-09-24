package JavaPolymorphism.MethodOverloadingInJava.JavaInstanceOF;

//Downcasting without the use of java instanceof

//Downcasting can also be performed without the use of instanceof operator as displayed in the following example:




public class Example4 {

    public static void main(String[] args) {

        Animal2 a = new Dog4();

        Dog4.method(a);

    }
}

class Animal2{


}


class Dog4 extends Animal2{

    static void method(Animal2 a){

        Dog4 d = (Dog4) a;//downcasting

        System.out.println("Ok Downcasting performed");

    }

}

//Let's take closer look at this, actual object that is referred by a, is an object of Dog class. So if we downcast it, it is fine. But what will happen if we write:
//Animal a=new Animal();
//Dog.method(a);