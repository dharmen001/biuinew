package JavaPolymorphism.MethodOverloadingInJava.JavaInstanceOF;
//Downcasting with java instanceof operator
//When subclass type refers to the object of parent class,it is known as downcasting.
//if we perform it directly , compiler gives compilation error. if you perform it
//typecasting, class cast Exception is thrown at run time. but if we use instance of operator, downcasting is possible.

//Possibility of downcasting with instanceof


public class Example3
{
    public static void main(String[] args) {

        Animal1 a = new Dog3();
        Dog3.method(a);

    }

}

class Animal1{


}

class Dog3 extends Animal1{


    static void method(Animal1 a){

        if (a instanceof Dog3){

            Dog3 d = (Dog3) a;//Downcasting

            System.out.println("OK Downcasting performed");
        }
    }
}