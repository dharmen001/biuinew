package JavaPolymorphism.MethodOverloadingInJava.TypePromotion;

public class OverloadingCalculation {

    public static void main(String[] args) {

        TestOverloadingCalculation To = new TestOverloadingCalculation();
        To.sum(20,30);
        To.sum(30,30,30);

    }
}


class TestOverloadingCalculation {

    void sum(int a, double b)
    {

        System.out.println(a + b);
    }

    void sum(int a, int b, int c){

        System.out.println(a+b+c);
    }

}