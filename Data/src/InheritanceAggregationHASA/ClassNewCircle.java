package InheritanceAggregationHASA;

public class ClassNewCircle {

    public static void main(String[] args) {

        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
    }

}

class Operation{

    int square(int n){

        return n*n;
    }
}

class Circle {

    Operation operation;
    double pi = 3.14;

    double area(int radius) {

        operation = new Operation();
        int rsquare = operation.square(radius);
        return pi*rsquare;

    }

}