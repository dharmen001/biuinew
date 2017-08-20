package JavaPolymorphism.MethodOverloadingInJava.FinalKeyword;

public class Bike16 {

    public static void main(String[] args) {

        Bike17 b = new Bike17();

        b.cube(5);
    }
}

class Bike17{

    int cube(final int n)
    {

        //n=n+2;//can't be changed as n is final

        return n*n*n;
    }
}