package JavaPolymorphism.MethodOverloadingInJava.changingdatatypeofarguments;

public class Adder {
    public static void main(String[] args) {

        Add ad = new Add();
        ad.sum(20,30);
        ad.sum(12.3,12.6);
    }

}

class Add
{

    void sum(int a, int b)

    {
        System.out.println(a+b);

    }

    void sum(double a, double b)

    {

        System.out.println(a+b);
    }

}