package JavaAbstraction;


public class Example2 {

    public static void main(String[] args) {

        Shape s = new Circle1();
        s.draw();
    }
}


abstract class Shape{
    abstract void draw();

        }

class Rectangle extends Shape{

    void draw(){

        System.out.println("Drawing rectangle");
    }
}

class Circle1 extends Shape{

    void draw(){

        System.out.println("Drawing circle");
    }
}


